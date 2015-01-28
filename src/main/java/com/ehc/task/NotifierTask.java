package com.ehc.task;

import org.apache.log4j.Logger;

import java.util.Date;


public class NotifierTask {

  private static Logger log = Logger.getLogger(NotifierTask.class);

  public void execute() {
    log.debug(new Date() + " :Notifier runs successfully...");
  }
}
