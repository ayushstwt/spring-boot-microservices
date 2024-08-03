package com.narainox.limits_service.entity;

public class Limits {
    private int min;
    private int max;

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public Limits(int min, int max) {
        this.min = min;
        this.max = max;
    }

    public Limits() {
    }
}
