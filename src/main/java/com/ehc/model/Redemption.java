package com.ehc.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Comparator;

/**
 * Created by ehc on 27/11/14.
 */
@Document
public class Redemption implements Comparator<Redemption> {
  @Id
  private String id;
  private long redeemedAt;
  private int amountSpent;
  private String customerId;
  private String managerId;
  private String dealId;
  private String businessLocationId;
  private long createdAt;
  private long updatedAt;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public long getRedeemedAt() {
    return redeemedAt;
  }

  public void setRedeemedAt(long redeemedAt) {
    this.redeemedAt = redeemedAt;
  }

  public int getAmountSpent() {
    return amountSpent;
  }

  public void setAmountSpent(int amountSpent) {
    this.amountSpent = amountSpent;
  }

  public String getCustomerId() {
    return customerId;
  }

  public void setCustomerId(String customerId) {
    this.customerId = customerId;
  }

  public String getManagerId() {
    return managerId;
  }

  public void setManagerId(String managerId) {
    this.managerId = managerId;
  }

  public String getDealId() {
    return dealId;
  }

  public void setDealId(String dealId) {
    this.dealId = dealId;
  }


  public String getBusinessLocationId() {
    return businessLocationId;
  }

  public void setBusinessLocationId(String businessLocationId) {
    this.businessLocationId = businessLocationId;
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

  @Override
  public String toString() {
    return "Redemption{" +
        "id='" + id + '\'' +
        ", redeemedAt=" + redeemedAt +
        ", amountSpent=" + amountSpent +
        ", customerId='" + customerId + '\'' +
        ", managerId='" + managerId + '\'' +
        ", dealId='" + dealId + '\'' +
        ", businessLocationId='" + businessLocationId + '\'' +
        ", createdAt=" + createdAt +
        ", updatedAt=" + updatedAt +
        '}';
  }

  @Override
  public int compare(Redemption redemption1, Redemption redemption2) {
    return (int) ((redemption1.redeemedAt)-redemption2.redeemedAt);
  }
}
