package com.example.qp;

import java.sql.Time;
import java.util.Date;

public class Task {
    public String taskName;
    public String dueDate;
    public Time timeDueDate;
    public int priority;
    public String description;
    public boolean completed;

    //Default constuctor
    public Task(String taskName, String  dueDate, Time timeDueDate, int priority, String description) {
        this.taskName = taskName;
        this.dueDate = dueDate;
        this.timeDueDate = timeDueDate;
        this.priority = priority;
        this.description = description;
    }

    // Fall back Constructor
    //Constructor for testing and getting fake data
    public Task() {
        this.taskName = "Test";
        this.dueDate = "01/01/2019";
        this.timeDueDate = new Time(12, 0,0);
        this.priority = 0;
        this.description = "Test Description";


    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
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

    @Override
    public String toString() {
        return "Task{" +
                "taskName='" + taskName + '\'' +
                ", dueDate=" + dueDate +
                ", timeDueDate=" + timeDueDate +
                ", priority=" + priority +
                ", description='" + description + '\'' +
                '}';
    }
}
