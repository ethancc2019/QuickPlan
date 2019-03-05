package com.example.qp;

import java.sql.Time;
import java.util.Date;

public class Task {
    private String taskName;
    private Date dueDate;
    private Time timeDueDate;
    private int priority;
    private String description;
    private boolean completed;

    //Default constuctor
    public Task(String taskName, Date dueDate, Time timeDueDate, int priority, String description, boolean completed) {
        this.taskName = taskName;
        this.dueDate = dueDate;
        this.timeDueDate = timeDueDate;
        this.priority = priority;
        this.description = description;
        this.completed = completed;
    }

    // Fall back Constructor
    public Task() {
        this.taskName = "";
        this.dueDate = new Date();
        this.timeDueDate = null;
        this.priority = 0;
        this.description = "";
        this.completed = false;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public Time getTimeDueDate() {
        return timeDueDate;
    }

    public void setTimeDueDate(Time timeDueDate) {
        this.timeDueDate = timeDueDate;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean getCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    @Override
    public String toString() {
        return "Task{" +
                "taskName='" + taskName + '\'' +
                ", dueDate=" + dueDate +
                ", timeDueDate=" + timeDueDate +
                ", priority=" + priority +
                ", description='" + description + '\'' +
                ", completed='" + completed + '\'' +
                '}';
    }
}
