package com.ehc.repository;

import com.ehc.model.Deal;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DealRepository extends MongoRepository<Deal, String> {
  public List<Deal> findById(String deal_id);

  @Query("{ 'manager_id' : ?0 }")
  Page<Deal> findByManagerId(String manager_id, Pageable pageable);

  public Deal findByCouponNumber(@Param("couponNumber") String couponNumber);
}
