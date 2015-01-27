package com.ehc.repository;

import com.ehc.model.BusinessLocation;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BusinessLocationRepository extends MongoRepository<BusinessLocation, String> {
  public BusinessLocation findById(String id);

  @Query("{ 'businessId' : ?0}")
  public List<BusinessLocation> findByBusinessId(String businessId);

  @Query("{ 'city' : ?0}")
  public List<BusinessLocation> findByCity(String city);

  @Query("{ 'managerId' : ?0 }")
  Page<BusinessLocation> findByManagerId(String managerId, Pageable pageable);

  @Query("{ 'ownerId' : ?0 }")
  Page<BusinessLocation> findByOwnerId(String ownerId, Pageable pageable);

}
