package com.lab1.entity;

import com.lab1.logger.Logger;

import java.sql.Timestamp;

public class Task {
    private final long id;
    private String description;
    private User assignee;

    private Logger logger;

    // Empty constructor
    public Task(long id, Logger logger) {
        this.id = id;
        this.logger = logger;
    }

    // Setters
    public void setDescription(String description) {
        this.description = description;
        logger.log(new Timestamp(System.currentTimeMillis())
                + " : Task " + id + " description updated to " + description);
    }

    public void setAssignee(User assignee) {
        this.assignee = assignee;
        logger.log(new Timestamp(System.currentTimeMillis())
                + " : Task " + id + " assignee updated to " + assignee);
    }

    public void setLogger(Logger logger) {
        this.logger = logger;
    }

    // Getters
    public String getDescription() {
        return description;
    }

    public User getAssignee() {
        return assignee;
    }
}
