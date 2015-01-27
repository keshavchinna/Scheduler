package com.ehc.repository;

import com.ehc.model.Manager;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


@Repository
public interface ManagerRepository extends MongoRepository<Manager, String> {

  public Manager findByEmail(@Param("email") String email);

  public Manager findByCellphone(@Param("cellphone") String cellphone);

  public Manager findById(@Param("_id") String id);

  public Manager findByAuthToken(@Param("authToken") String authToken);
}
