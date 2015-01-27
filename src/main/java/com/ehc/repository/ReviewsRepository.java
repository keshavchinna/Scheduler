package com.ehc.repository;

import com.ehc.model.Review;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ReviewsRepository extends MongoRepository<Review, String> {
  public Review findByBusinessLocationId(String locid);
}
