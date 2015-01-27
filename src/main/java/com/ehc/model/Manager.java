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
public class Manager {
  public Map<String, String> businessLocationList = new HashMap<String, String>();
  public List<String> messageIdList = new ArrayList<String>();
  @Id
  private String id;
  private boolean admin;
  private boolean receiveBroadcastMessages;
  private String firstName;
  private String lastName;
  private String email;
  private String password;
  private String cellphone;
  private String phoneNumber;
  private String street;
  private String city;
  private String state;
  private String zip;
  private String country;
  private String authToken;
  private String authorizationCode;
  private String website;
  private String businessId;
  private String profileImage;
  private long createdAt;
  private long updatedAt;

  public Map<String, String> getBusinessLocationList() {
    return businessLocationList;
  }

  public void setBusinessLocationList(Map<String, String> businessLocationList) {
    this.businessLocationList = businessLocationList;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public boolean isAdmin() {
    return admin;
  }

  public void setAdmin(boolean admin) {
    this.admin = admin;
  }

  public boolean isReceiveBroadcastMessages() {
    return receiveBroadcastMessages;
  }

  public void setReceiveBroadcastMessages(boolean receiveBroadcastMessages) {
    this.receiveBroadcastMessages = receiveBroadcastMessages;
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

  public String getCellphone() {
    return cellphone;
  }

  public void setCellphone(String cellphone) {
    this.cellphone = cellphone;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
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

  public String getAuthToken() {
    return authToken;
  }

  public void setAuthToken(String authToken) {
    this.authToken = authToken;
  }

  public String getAuthorizationCode() {
    return authorizationCode;
  }

  public void setAuthorizationCode(String authorizationCode) {
    this.authorizationCode = authorizationCode;
  }

  public String getWebsite() {
    return website;
  }

  public void setWebsite(String website) {
    this.website = website;
  }

  public String getProfileImage() {
    return profileImage;
  }

  public void setProfileImage(String profileImage) {
    this.profileImage = profileImage;
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

  public String getBusinessId() {
    return businessId;
  }

  public void setBusinessId(String businessId) {
    this.businessId = businessId;
  }

  public List<String> getMessageIdList() {
    return messageIdList;
  }

  public void setMessageIdList(List<String> messageIdList) {
    this.messageIdList = messageIdList;
  }

  @Override
  public String toString() {
    return "Manager{" +
        "businessLocationList=" + businessLocationList +
        ", messageIdList=" + messageIdList +
        ", id='" + id + '\'' +
        ", admin=" + admin +
        ", receiveBroadcastMessages=" + receiveBroadcastMessages +
        ", firstName='" + firstName + '\'' +
        ", lastName='" + lastName + '\'' +
        ", email='" + email + '\'' +
        ", password='" + password + '\'' +
        ", cellphone='" + cellphone + '\'' +
        ", phoneNumber='" + phoneNumber + '\'' +
        ", street='" + street + '\'' +
        ", city='" + city + '\'' +
        ", state='" + state + '\'' +
        ", zip='" + zip + '\'' +
        ", country='" + country + '\'' +
        ", authToken='" + authToken + '\'' +
        ", authorizationCode='" + authorizationCode + '\'' +
        ", website='" + website + '\'' +
        ", businessId='" + businessId + '\'' +
        ", profileImage='" + profileImage + '\'' +
        ", createdAt=" + createdAt +
        ", updatedAt=" + updatedAt +
        '}';
  }
}
