package com.ehc.task;

import com.ehc.model.Deal;
import com.ehc.model.Notification;
import com.ehc.repository.CustomerRepository;
import com.ehc.repository.NotificationRepository;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

import java.util.Date;
import java.util.List;


public class SchedulerTask {

  private static Logger log = Logger.getLogger(SchedulerTask.class);
  @Autowired
  CustomerRepository customerRepository;
  @Autowired
  MongoTemplate mongoTemplate;
  @Autowired
  NotificationRepository notificationRepository;

/*  public SchedulerTask() {
    log.debug(new Date() + ": Scheduler Running.....");
  }*/

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
      notification.setStatus(false);
      notification.setEndDate(deal.getEndDate());
      notificationRepository.save(notification);
    }
  }

  public void visitBasedLoyalty() {
    log.debug(new Date() + ": visitBasedLoyalty Running.....");
  }

}
