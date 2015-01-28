package com.ehc.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

/**
 * Created by ehc on 28/1/15.
 */
@Document
public class Notification {
  @Id
  private String id;
  private String location;
  private String customerId;
  private String campaignTypeId;
  private String dealId;
  private String message;
  private Date startDate;
  private Date endDate;
  private String trigger;
  private boolean deliveryStatus;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public String getCustomerId() {
    return customerId;
  }

  public void setCustomerId(String customerId) {
    this.customerId = customerId;
  }

  public String getCampaignTypeId() {
    return campaignTypeId;
  }

  public void setCampaignTypeId(String campaignTypeId) {
    this.campaignTypeId = campaignTypeId;
  }

  public String getDealId() {
    return dealId;
  }

  public void setDealId(String dealId) {
    this.dealId = dealId;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public Date getStartDate() {
    return startDate;
  }

  public void setStartDate(Date startDate) {
    this.startDate = startDate;
  }

  public Date getEndDate() {
    return endDate;
  }

  public void setEndDate(Date endDate) {
    this.endDate = endDate;
  }

  public String getTrigger() {
    return trigger;
  }

  public void setTrigger(String trigger) {
    this.trigger = trigger;
  }

  public boolean getDeliveryStatus() {
    return deliveryStatus;
  }

  public void setDeliveryStatus(boolean deliveryStatus) {
    this.deliveryStatus = deliveryStatus;
  }

  @Override
  public String toString() {
    return "Notification{" +
        "id='" + id + '\'' +
        ", location='" + location + '\'' +
        ", customerId='" + customerId + '\'' +
        ", campaignTypeId='" + campaignTypeId + '\'' +
        ", dealId='" + dealId + '\'' +
        ", message='" + message + '\'' +
        ", startDate='" + startDate + '\'' +
        ", endDate='" + endDate + '\'' +
        ", trigger='" + trigger + '\'' +
        ", deliveryStatus='" + deliveryStatus + '\'' +
        '}';
  }
}
