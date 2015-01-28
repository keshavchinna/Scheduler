package com.ehc.task;

import com.ehc.model.BusinessLocation;
import com.ehc.model.Customer;
import com.ehc.model.Deal;
import com.ehc.model.Notification;
import com.ehc.repository.BusinessLocationRepository;
import com.ehc.repository.CustomerRepository;
import com.ehc.repository.NotificationRepository;
import org.apache.commons.lang.time.DateUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;


public class SchedulerTask {

  private static Logger log = Logger.getLogger(SchedulerTask.class);
  @Autowired
  CustomerRepository customerRepository;
  @Autowired
  MongoTemplate mongoTemplate;
  @Autowired
  NotificationRepository notificationRepository;
  @Autowired
  BusinessLocationRepository businessLocationRepository;

  public void spendBasedLoyalty() {
    log.debug(new Date() + ": Scheduler Running.....");
    Query query = new Query(Criteria.where("campaignTypeId").exists(true).andOperator(
        Criteria.where("campaignTypeId").is("111"),
        Criteria.where("startDate").gt(new Date())
    ));
    List<Deal> dealList = mongoTemplate.find(query, Deal.class);
    if (!dealList.isEmpty())
      for (Deal deal : dealList) {
        if (notificationRepository.findByDealId(deal.getId()) == null) {
          saveSpendBasedLoyalty(deal);
        }
      }
  }

  public void visitBasedLoyalty() {
    log.debug(new Date() + ": visitBasedLoyalty Running.....");
    Query query = new Query(Criteria.where("campaignTypeId").exists(true).andOperator(
        Criteria.where("campaignTypeId").is("101"),
        Criteria.where("startDate").gt(new Date())
    ));
    List<Deal> dealList = mongoTemplate.find(query, Deal.class);
    if (!dealList.isEmpty())
      for (Deal deal : dealList) {
        if (notificationRepository.findByDealId(deal.getId()) == null) {
          getLocations(deal);
        }
      }
  }

  public void birthDayCampaign() {
    log.debug(new Date() + ": BirthDay Running.....");
    Query query = new Query(Criteria.where("campaignTypeId").exists(true).andOperator(
        Criteria.where("campaignTypeId").is("104"),
        Criteria.where("startDate").gt(new Date())
    ));
    List<Deal> dealList = mongoTemplate.find(query, Deal.class);
    if (!dealList.isEmpty())
      for (Deal deal : dealList) {
        setBirthday(deal);
      }
  }

  private void setBirthday(Deal deal) {
    Query query;
    if (notificationRepository.findByDealId(deal.getId()) == null) {
      query = new Query(Criteria.where("visitedLocationsIdList").is(deal.getLocationId()));
      query.fields().include("_id");
      query.fields().include("dateOfBirth");
      List<Customer> customerList = mongoTemplate.find(query, Customer.class);
      for (Customer customer : customerList) {
        Date currentTime = new Date();
        String date = customer.getDateOfBirth();
        String dateArray[] = customer.getDateOfBirth().split("/");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        try {
          setBirthDayCampaign(deal, customer, currentTime, simpleDateFormat.parse(date), dateArray[2]);
        } catch (Exception e) {
          e.printStackTrace();
        }
      }
    }
  }

  private void setBirthDayCampaign(Deal deal, Customer customer, Date currentTime, Date parse, String s) throws ParseException {
    Date customerDOB;
    Date nextDOB;
    int year = Calendar.getInstance().get(Calendar.YEAR) - Integer.parseInt(s);
    customerDOB = DateUtils.addYears(parse, year);
    nextDOB = DateUtils.addWeeks(new Date(), 2);
    if (customerDOB.after(currentTime) && customerDOB.before(nextDOB)) {
      String[] trigger = deal.getNotificationChannels().split(",");
      for (String notificationChannel : trigger) {
        Notification notification = new Notification();
        notification.setDealId(deal.getId());
        notification.setCampaignTypeId(deal.getCampaignTypeId());
        notification.setMessage(deal.getDetails());
        notification.setStartDate(deal.getStartDate());
        notification.setTrigger(notificationChannel);
        notification.setCustomerId(customer.getId());
        notification.setDeliveryStatus(false);
        notification.setEndDate(deal.getEndDate());
        notification.setLocation(deal.getLocationId());
        notificationRepository.save(notification);
      }
    }
  }

  private void saveSpendBasedLoyalty(Deal deal) {
    Notification notification;
    String[] trigger = deal.getNotificationChannels().split(",");
    for (String notificationChannel : trigger) {
      notification = new Notification();
      notification.setDealId(deal.getId());
      notification.setCampaignTypeId(deal.getCampaignTypeId());
      notification.setMessage(deal.getDetails());
      notification.setStartDate(deal.getStartDate());
      notification.setTrigger(notificationChannel);
      notification.setDeliveryStatus(false);
      notification.setEndDate(deal.getEndDate());
      notification.setLocation(deal.getLocationId());
      notificationRepository.save(notification);
    }
  }

  private void getLocations(Deal deal) {
    Query query;
    query = new Query(Criteria.where("_id").is(deal.getLocationId()));
    query.fields().include("customerVisits");
    BusinessLocation businessLocation = mongoTemplate.findOne(query, BusinessLocation.class);
    if (businessLocation != null) {
      for (Map.Entry<String, String> entry : businessLocation.getCustomerVisits().entrySet()) {
        if (Integer.parseInt(entry.getValue()) >= 5) {
          Notification notification;
          String[] trigger = deal.getNotificationChannels().split(",");
          for (String notificationChannel : trigger) {
            setVisitBasedLoyaltyNotification(deal, businessLocation, entry, notificationChannel);
          }
        }
      }
    }
  }

  private void setVisitBasedLoyaltyNotification(Deal deal, BusinessLocation businessLocation, Map.Entry<String, String> entry, String notificationChannel) {
    Notification notification;
    notification = new Notification();
    notification.setDealId(deal.getId());
    notification.setCampaignTypeId(deal.getCampaignTypeId());
    notification.setMessage(deal.getDetails());
    notification.setStartDate(deal.getStartDate());
    notification.setTrigger(notificationChannel);
    notification.setDeliveryStatus(false);
    notification.setEndDate(deal.getEndDate());
    notification.setCustomerId(entry.getKey());
    notification.setLocation(businessLocation.getId());
    notificationRepository.save(notification);
  }
}
