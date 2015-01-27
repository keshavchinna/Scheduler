package com.ehc.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by ehc on 27/11/14.
 */
@Document
public class BusinessLocation {
  public Map<String, List<Review>> reviews = new HashMap<String, List<Review>>();
  public Map<String, String> customerVisits = new HashMap<String, String>();
  public List<Redemption> redemptionIdList = new ArrayList<Redemption>();
  public Map<String, Map<String, Integer>> shareChannels = new HashMap<>();
  public List<String> imagesList = new ArrayList<String>();
  @Id
  private String id;
  private String managerId;
  private String ownerId;
  private String businessId;
  private String location;
  private String averageRating;
  private String timeZone;
  private String status;
  private String street;
  private String city;
  private String state;
  private String beaconId;
  private String zip;
  private String country;
  private long createdAt;
  private long updatedAt;

  public Map<String, List<Review>> getReviews() {
    return reviews;
  }

  public void setReviews(Map<String, List<Review>> reviews) {
    this.reviews = reviews;
  }

  public Map<String, String> getCustomerVisits() {
    return customerVisits;
  }

  public void setCustomerVisits(Map<String, String> customerVisits) {
    this.customerVisits = customerVisits;
  }

  public List<Redemption> getRedemptionIdList() {
    return redemptionIdList;
  }

  public void setRedemptionIdList(List<Redemption> redemptionIdList) {
    this.redemptionIdList = redemptionIdList;
  }

  public Map<String, Map<String, Integer>> getShareChannels() {
    return shareChannels;
  }

  public void setShareChannels(Map<String, Map<String, Integer>> shareChannels) {
    this.shareChannels = shareChannels;
  }

  public List<String> getImagesList() {
    return imagesList;
  }

  public void setImagesList(List<String> imagesList) {
    this.imagesList = imagesList;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getManagerId() {
    return managerId;
  }

  public void setManagerId(String managerId) {
    this.managerId = managerId;
  }

  public String getOwnerId() {
    return ownerId;
  }

  public void setOwnerId(String ownerId) {
    this.ownerId = ownerId;
  }

  public String getBusinessId() {
    return businessId;
  }

  public void setBusinessId(String businessId) {
    this.businessId = businessId;
  }

  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public String getAverageRating() {
    return averageRating;
  }

  public void setAverageRating(String averageRating) {
    this.averageRating = averageRating;
  }

  public String getTimeZone() {
    return timeZone;
  }

  public void setTimeZone(String timeZone) {
    this.timeZone = timeZone;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public String getStreet() {
    return street;
  }

  public void setStreet(String street) {
    this.street = street;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public String getZip() {
    return zip;
  }

  public void setZip(String zip) {
    this.zip = zip;
  }

  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
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

  public String getBeaconId() {
    return beaconId;
  }

  public void setBeaconId(String beaconId) {
    this.beaconId = beaconId;
  }

  @Override
  public String toString() {
    return "BusinessLocation{" +
        "reviews=" + reviews +
        ", customerVisits=" + customerVisits +
        ", redemptionIdList=" + redemptionIdList +
        ", shareChannels=" + shareChannels +
        ", imagesList=" + imagesList +
        ", id='" + id + '\'' +
        ", managerId='" + managerId + '\'' +
        ", ownerId='" + ownerId + '\'' +
        ", businessId='" + businessId + '\'' +
        ", location='" + location + '\'' +
        ", averageRating='" + averageRating + '\'' +
        ", timeZone='" + timeZone + '\'' +
        ", status='" + status + '\'' +
        ", street='" + street + '\'' +
        ", city='" + city + '\'' +
        ", state='" + state + '\'' +
        ", beaconId='" + beaconId + '\'' +
        ", zip='" + zip + '\'' +
        ", country='" + country + '\'' +
        ", createdAt=" + createdAt +
        ", updatedAt=" + updatedAt +
        '}';
  }
}
