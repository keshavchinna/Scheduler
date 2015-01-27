package com.ehc.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by ehc on 27/11/14.
 */
@Document
public class Review {
  @Id
  private String id;
  private String businessLocationId;
  private String dealId;
  private String customerId;
  private String review;
  private float rating;
  private long reviewedAt;
  private long createdAt;
  private long updatedAt;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getBusinessLocationId() {
    return businessLocationId;
  }

  public void setBusinessLocationId(String businessLocationId) {
    this.businessLocationId = businessLocationId;
  }

  public String getDealId() {
    return dealId;
  }

  public void setDealId(String dealId) {
    this.dealId = dealId;
  }

  public String getCustomerId() {
    return customerId;
  }

  public void setCustomerId(String customerId) {
    this.customerId = customerId;
  }

  public String getReview() {
    return review;
  }

  public void setReview(String review) {
    this.review = review;
  }

  public float getRating() {
    return rating;
  }

  public void setRating(float rating) {
    this.rating = rating;
  }

  public long getReviewedAt() {
    return reviewedAt;
  }

  public void setReviewedAt(long reviewedAt) {
    this.reviewedAt = reviewedAt;
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
    return "Review{" +
        "id='" + id + '\'' +
        ", businessLocationId='" + businessLocationId + '\'' +
        ", dealId='" + dealId + '\'' +
        ", customerId='" + customerId + '\'' +
        ", review='" + review + '\'' +
        ", rating=" + rating +
        ", reviewedAt=" + reviewedAt +
        ", createdAt=" + createdAt +
        ", updatedAt=" + updatedAt +
        '}';
  }
}
