package com.example.demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class MigrationCheckTask {

  private static final Logger logger = LogManager.getLogger(MigrationCheckTask.class);

  @Scheduled(fixedRate = 10000) // Schedule the task with a fixed rate of 10 seconds
  public void checkMigration() {
    logger.info("Migration Check Executed");
  }
}