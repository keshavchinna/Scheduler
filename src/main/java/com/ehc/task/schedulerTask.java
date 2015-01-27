package com.ehc.task;

import org.apache.log4j.Logger;

import java.util.Date;


public class schedulerTask {

  private static Logger log = Logger.getLogger(schedulerTask.class);

  public void spendBasedLoyalty() {
    log.debug(new Date() + ": spendBasedLoyalty Running.....");
  }

  public void visitBasedLoyalty() {
    log.debug(new Date() + ": visitBasedLoyalty Running.....");
  }

}
