package com.ivanmagda.habito.models;

public class ResetParameterObject {
    private final String resetFreq;
    private final long resetTimestamp;

    public ResetParameterObject(String resetFreq, long resetTimestamp) {
        this.resetFreq = resetFreq;
        this.resetTimestamp = resetTimestamp;
    }

    public String getResetFreq() {
        return resetFreq;
    }

    public long getResetTimestamp() {
        return resetTimestamp;
    }
}
