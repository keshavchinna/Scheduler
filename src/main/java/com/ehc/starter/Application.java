package com.ehc.starter;

import com.ehc.service.SchedulerServiceI;
import com.ehc.service.SchedulerServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@ComponentScan
@EnableAutoConfiguration
@EnableMongoRepositories
@ImportResource("classpath:SpringContext.xml")
public class Application {
  public static void main(String[] args) throws Exception {
    SpringApplication.run(Application.class, args);
//    new ClassPathXmlApplicationContext("SpringContext.xml");
  }
}
