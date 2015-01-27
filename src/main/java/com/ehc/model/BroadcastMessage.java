package com.ehc.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by ehc on 8/1/15.
 */
@Document
public class BroadcastMessage {
  @Id
  private String id;
  private String customerId;
  private String message;
  private long timeStamp;
  private String businessType;
  private long createdAt;
  private long updatedAt;
  private String customerLatLong;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getCustomerId() {
    return customerId;
  }

  public void setCustomerId(String customerId) {
    this.customerId = customerId;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public long getTimeStamp() {
    return timeStamp;
  }

  public void setTimeStamp(long timeStamp) {
    this.timeStamp = timeStamp;
  }

  public String getBusinessType() {
    return businessType;
  }

  public void setBusinessType(String businessType) {
    this.businessType = businessType;
  }

  public long getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(long createdAt) {
    this.createdAt = createdAt;
  }

  public long getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(long updatedAt) {
    this.updatedAt = updatedAt;
  }

  public String getCustomerLatLong() {
    return customerLatLong;
  }

  public void setCustomerLatLong(String customerLatLong) {
    this.customerLatLong = customerLatLong;
  }

  @Override
  public String toString() {
    return "BroadcastMessage{" +
        "id='" + id + '\'' +
        ", customerId='" + customerId + '\'' +
        ", message='" + message + '\'' +
        ", timeStamp=" + timeStamp +
        ", businessType='" + businessType + '\'' +
        ", createdAt=" + createdAt +
        ", updatedAt=" + updatedAt +
        ", setCustomerLatLong='" + customerLatLong + '\'' +
        '}';
  }
}
