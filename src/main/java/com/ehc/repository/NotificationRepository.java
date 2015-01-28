package com.ehc.repository;

import com.ehc.model.Notification;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NotificationRepository extends MongoRepository<Notification, String> {
  public Notification findByDealId(String dealId);
}
