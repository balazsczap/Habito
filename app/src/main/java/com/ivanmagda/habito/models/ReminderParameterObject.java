package com.ivanmagda.habito.models;

public class ReminderParameterObject {
    private final int reminderHour;
    private final int reminderMin;

    public ReminderParameterObject(int reminderHour, int reminderMin) {
        this.reminderHour = reminderHour;
        this.reminderMin = reminderMin;
    }

    public int getReminderHour() {
        return reminderHour;
    }

    public int getReminderMin() {
        return reminderMin;
    }
}
