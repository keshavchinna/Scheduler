package com.ehc.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by ehc on 27/11/14.
 */
@Document
public class Deal {
  public Map<String, Map<String, Integer>> shareChannels = new HashMap<>();
  public Map<String, List<Review>> reviews = new HashMap<String, List<Review>>();
  @Id
  private String id;
  private String dealType;
  private Date startDate;
  private Date endDate;
  private String startTime;
  private String expiryDate;
  private String details;
  private int discount;
  private int price;
  private int points;
  private String businessType;
  private int minimumPurchaseAmount;
  private String couponNumber;
  private String coverImageUrl;
  private String campaignTypeId;
  private String campaignName;
  private String notificationChannels;
  private String status;
  private String offerCode;
  private String managerId;
  private String locationId;
  private long createdAt;
  private long updatedAt;

  public Map<String, Map<String, Integer>> getShareChannels() {
    return shareChannels;
  }

  public void setShareChannels(Map<String, Map<String, Integer>> shareChannels) {
    this.shareChannels = shareChannels;
  }

  public String getCampaignTypeId() {
    return campaignTypeId;
  }

  public void setCampaignTypeId(String campaignTypeId) {
    this.campaignTypeId = campaignTypeId;
  }

  public Map<String, List<Review>> getReviews() {
    return reviews;
  }

  public void setReviews(Map<String, List<Review>> reviews) {
    this.reviews = reviews;
  }

  public String getManagerId() {
    return managerId;
  }

  public void setManagerId(String managerId) {
    this.managerId = managerId;
  }

  public String getOfferCode() {
    return offerCode;
  }

  public void setOfferCode(String offerCode) {
    this.offerCode = offerCode;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public String getDealType() {
    return dealType;
  }

  public void setDealType(String dealType) {
    this.dealType = dealType;
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

  public String getStartTime() {
    return startTime;
  }

  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }

  public String getExpiryDate() {
    return expiryDate;
  }

  public void setExpiryDate(String expiryDate) {
    this.expiryDate = expiryDate;
  }

  public String getDetails() {
    return details;
  }

  public void setDetails(String details) {
    this.details = details;
  }

  public int getDiscount() {
    return discount;
  }

  public void setDiscount(int discount) {
    this.discount = discount;
  }

  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }

  public int getPoints() {
    return points;
  }

  public void setPoints(int points) {
    this.points = points;
  }

  public int getMinimumPurchaseAmount() {
    return minimumPurchaseAmount;
  }

  public void setMinimumPurchaseAmount(int minimumPurchaseAmount) {
    this.minimumPurchaseAmount = minimumPurchaseAmount;
  }

  public String getCoverImageUrl() {
    return coverImageUrl;
  }

  public void setCoverImageUrl(String coverImageUrl) {
    this.coverImageUrl = coverImageUrl;
  }

  public String getLocationId() {
    return locationId;
  }

  public void setLocationId(String locationId) {
    this.locationId = locationId;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getCampaignName() {
    return campaignName;
  }

  public void setCampaignName(String campaignName) {
    this.campaignName = campaignName;
  }

  public String getNotificationChannels() {
    return notificationChannels;
  }

  public void setNotificationChannels(String notificationChannels) {
    this.notificationChannels = notificationChannels;
  }

  public String getCouponNumber() {
    return couponNumber;
  }

  public void setCouponNumber(String couponNumber) {
    this.couponNumber = couponNumber;
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

  public String getBusinessType() {
    return businessType;
  }

  public void setBusinessType(String businessType) {
    this.businessType = businessType;
  }

  @Override
  public String toString() {
    return "Deal{" +
        "shareChannels=" + shareChannels +
        ", reviews=" + reviews +
        ", id='" + id + '\'' +
        ", dealType='" + dealType + '\'' +
        ", startDate=" + startDate +
        ", endDate=" + endDate +
        ", startTime='" + startTime + '\'' +
        ", expiryDate='" + expiryDate + '\'' +
        ", details='" + details + '\'' +
        ", discount=" + discount +
        ", price=" + price +
        ", points=" + points +
        ", businessType='" + businessType + '\'' +
        ", minimumPurchaseAmount=" + minimumPurchaseAmount +
        ", couponNumber='" + couponNumber + '\'' +
        ", coverImageUrl='" + coverImageUrl + '\'' +
        ", campaignTypeId='" + campaignTypeId + '\'' +
        ", campaignName='" + campaignName + '\'' +
        ", notificationChannels='" + notificationChannels + '\'' +
        ", status='" + status + '\'' +
        ", offerCode='" + offerCode + '\'' +
        ", managerId='" + managerId + '\'' +
        ", locationId='" + locationId + '\'' +
        ", createdAt=" + createdAt +
        ", updatedAt=" + updatedAt +
        '}';
  }
}
