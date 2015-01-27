package com.ehc.repository;

import com.ehc.model.BroadcastMessage;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface BroadcastMessageRepository extends MongoRepository<BroadcastMessage, String> {
  @Query("{ 'businessType' : ?0 }")
  Page<BroadcastMessage> findByBusinessType(String businessType, Pageable pageable);
}
