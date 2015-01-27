package com.ehc.service;

import com.ehc.task.NotifierTask;
import com.ehc.task.schedulerTask;
import org.springframework.beans.factory.annotation.Autowired;

public class SchedulerServiceImpl implements SchedulerServiceI {

  @Autowired
  schedulerTask schedulerTask;
  @Autowired
  NotifierTask notifierTask;


  public void executeScheduleTask() {
    getSchedulerTask().spendBasedLoyalty();

  }


  public void executeNotificationTask() {
    getNotifierTask().execute();
  }


  public schedulerTask getSchedulerTask() {
    return schedulerTask;
  }


  public void setSchedulerTask(schedulerTask schedulerTask) {
    this.schedulerTask = schedulerTask;
  }


  public NotifierTask getNotifierTask() {
    return notifierTask;
  }


  public void setNotifierTask(NotifierTask notifierTask) {
    this.notifierTask = notifierTask;
  }

}
