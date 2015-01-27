package com.ehc.repository;

import com.ehc.model.Redemption;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface RedemptionRepository extends MongoRepository<Redemption, String> {

  public static class PageSpecification {
    public static Pageable constructPageSpecification(final int pageIndex, final int pageSize) {
      return new PageRequest(pageIndex, pageSize);
    }
  }

  @Query("{ 'businessLocationId' : ?0 }")
  Page<Redemption> findByLocationId(String businessLocation_id, Pageable pageable);

  @Query("{ 'managerId' : ?0 }")
  Page<Redemption> findByManagerId(String merchant_id, Pageable pageable);

  @Query("{ 'businessLocationId' : ?0 }")
  List<Redemption> findByLocationId(String businessLocation_id);
}
