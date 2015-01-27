package com.ehc.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Document
public class Customer {
  public Map<String, List<Deal>> savedDeals = new HashMap<String, List<Deal>>();
  public List<String> visitedLocationsIdList = new ArrayList<String>();
  public List<Redemption> redemptionIdList = new ArrayList<Redemption>();
  public List<Review> locationReviews = new ArrayList<Review>();
  public List<Review> dealReviews = new ArrayList<Review>();
  @Id
  private String id;
  private String firstName;
  private String lastName;
  private String email;
  private String password;
  private String dateOfBirth;
  private String location;
  private int points;
  private String facebookId;
  private String gender;
  private String authToken;
  private long createdAt;
  private long updatedAt;
  private String profilePic;

  public Map<String, List<Deal>> getSavedDeals() {
    return savedDeals;
  }

  public void setSavedDeals(Map<String, List<Deal>> savedDeals) {
    this.savedDeals = savedDeals;
  }

  public List<String> getVisitedLocationsIdList() {
    return visitedLocationsIdList;
  }

  public void setVisitedLocationsIdList(List<String> visitedLocationsIdList) {
    this.visitedLocationsIdList = visitedLocationsIdList;
  }

  public List<Redemption> getRedemptionIdList() {
    return redemptionIdList;
  }

  public void setRedemptionIdList(List<Redemption> redemptionIdList) {
    this.redemptionIdList = redemptionIdList;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getDateOfBirth() {
    return dateOfBirth;
  }

  public void setDateOfBirth(String dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }

  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public int getPoints() {
    return points;
  }

  public void setPoints(int points) {
    this.points = points;
  }

  public String getFacebookId() {
    return facebookId;
  }

  public void setFacebookId(String facebookId) {
    this.facebookId = facebookId;
  }

  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public String getAuthToken() {
    return authToken;
  }

  public void setAuthToken(String authToken) {
    this.authToken = authToken;
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

  public String getProfilePic() {
    return profilePic;
  }

  public void setProfilePic(String profilePic) {
    this.profilePic = profilePic;
  }

  public List<Review> getLocationReviews() {
    return locationReviews;
  }

  public void setLocationReviews(List<Review> locationReviews) {
    this.locationReviews = locationReviews;
  }

  public List<Review> getDealReviews() {
    return dealReviews;
  }

  public void setDealReviews(List<Review> dealReviews) {
    this.dealReviews = dealReviews;
  }

  @Override
  public String toString() {
    return "Customer{" +
        "savedDeals=" + savedDeals +
        ", visitedLocationsIdList=" + visitedLocationsIdList +
        ", redemptionIdList=" + redemptionIdList +
        ", locationReviews=" + locationReviews +
        ", dealReviews=" + dealReviews +
        ", id='" + id + '\'' +
        ", firstName='" + firstName + '\'' +
        ", lastName='" + lastName + '\'' +
        ", email='" + email + '\'' +
        ", password='" + password + '\'' +
        ", dateOfBirth='" + dateOfBirth + '\'' +
        ", location='" + location + '\'' +
        ", points=" + points +
        ", facebookId='" + facebookId + '\'' +
        ", gender='" + gender + '\'' +
        ", authToken='" + authToken + '\'' +
        ", createdAt=" + createdAt +
        ", updatedAt=" + updatedAt +
        ", profilePic='" + profilePic + '\'' +
        '}';
  }
}

