package com.lab1.entity;

import com.lab1.logger.Logger;

import java.sql.Timestamp;
import java.util.Objects;
import java.util.Optional;

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
        logger.log("Task " + id + " description updated to " + description);
    }

    public void setAssignee(User assignee) {
        this.assignee = assignee;
        Optional.ofNullable(assignee).ifPresent(user -> user.addTask(this));
        logger.log("Task " + id + " assignee updated to " + assignee);
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return id == task.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", description='" + description + '\'' +
                '}';
    }
}
