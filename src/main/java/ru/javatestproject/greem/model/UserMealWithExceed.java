package ru.javatestproject.greem.model;

import java.time.LocalDateTime;

public class UserMealWithExceed {
    protected final LocalDateTime dateTime;
    protected final String description;
    protected final boolean exceed;

    public UserMealWithExceed(LocalDateTime dateTime, String description, boolean exceed) {
        this.dateTime = dateTime;
        this.description = description;
        this.exceed = exceed;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public String getDescription() {
        return description;
    }

    public boolean isExceed() {
        return exceed;
    }
}
