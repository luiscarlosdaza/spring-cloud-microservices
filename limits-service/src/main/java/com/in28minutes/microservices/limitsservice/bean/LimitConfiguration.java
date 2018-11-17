package com.in28minutes.microservices.limitsservice.bean;

public class LimitConfiguration {
    private int minimum;
    private int maximum;

    public LimitConfiguration(int minimum, int maximum) {
        super();
        this.minimum = minimum;
        this.maximum = maximum;
    }

    public int getMaximum() {
        return maximum;
    }

    public int getMinimum() {
        return minimum;
    }
}
