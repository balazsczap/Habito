package com.ivanmagda.habito.models;

import java.util.List;

public class HabitRecordParameterObject {
    private final String userId;
    private final long createdAt;
    private final String name;
    private final int color;
    private final int target;
    private final String resetFreq;
    private final long resetTimestamp;
    private final int reminderHour;
    private final int reminderMin;
    private final int score;
    private final List<Long> checkmarks;

    public HabitRecordParameterObject(String userId, long createdAt, String name, int color, int target, String resetFreq, long resetTimestamp, int reminderHour, int reminderMin, int score, List<Long> checkmarks) {
        this.userId = userId;
        this.createdAt = createdAt;
        this.name = name;
        this.color = color;
        this.target = target;
        this.resetFreq = resetFreq;
        this.resetTimestamp = resetTimestamp;
        this.reminderHour = reminderHour;
        this.reminderMin = reminderMin;
        this.score = score;
        this.checkmarks = checkmarks;
    }

    public String getUserId() {
        return userId;
    }

    public long getCreatedAt() {
        return createdAt;
    }

    public String getName() {
        return name;
    }

    public int getColor() {
        return color;
    }

    public int getTarget() {
        return target;
    }

    public String getResetFreq() {
        return resetFreq;
    }

    public long getResetTimestamp() {
        return resetTimestamp;
    }

    public int getReminderHour() {
        return reminderHour;
    }

    public int getReminderMin() {
        return reminderMin;
    }

    public int getScore() {
        return score;
    }

    public List<Long> getCheckmarks() {
        return checkmarks;
    }
}
