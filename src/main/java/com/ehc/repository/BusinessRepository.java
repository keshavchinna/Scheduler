package com.ehc.repository;

import com.ehc.model.Business;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface BusinessRepository extends MongoRepository<Business, String> {
  @Query("{ 'ownerId' : ?0 }")
  public Business findByOwnerId(String ownerId);
}
