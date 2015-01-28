package com.ehc.service;

import com.ehc.repository.CustomerRepository;
import com.ehc.repository.RedemptionRepository;
import com.ehc.task.NotifierTask;
import com.ehc.task.SchedulerTask;
import org.springframework.beans.factory.annotation.Autowired;

public class SchedulerServiceImpl implements SchedulerServiceI {

  @Autowired
  SchedulerTask schedulerTask;
  @Autowired
  NotifierTask notifierTask;
  @Autowired
  CustomerRepository customerRepository;
  @Autowired
  RedemptionRepository redemptionRepository;

  public void executeScheduleTask() {
    getSchedulerTask().spendBasedLoyalty();
  }


  public void executeNotificationTask() {
    getNotifierTask().execute();
  }


  public SchedulerTask getSchedulerTask() {
    return schedulerTask;
  }


  public void setSchedulerTask(SchedulerTask schedulerTask) {
    this.schedulerTask = schedulerTask;
  }


  public NotifierTask getNotifierTask() {
    return notifierTask;
  }


  public void setNotifierTask(NotifierTask notifierTask) {
    this.notifierTask = notifierTask;
  }

}
