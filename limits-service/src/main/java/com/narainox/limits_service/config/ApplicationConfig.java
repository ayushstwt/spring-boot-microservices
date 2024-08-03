package com.narainox.limits_service.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("limits-service")
public class ApplicationConfig {
    int maximum;
    int minimum;

    public int getMaximum() {
        return maximum;
    }
    public void setMaximum(int maximum) {
        this.maximum = maximum;
    }
    public int getMinimum() {
        return minimum;
    }
    public void setMinimum(int minimum) {
        this.minimum = minimum;
    }

    public ApplicationConfig(int maximum, int minimum) {
        this.maximum = maximum;
        this.minimum = minimum;
    }

    public ApplicationConfig() {
    }
}
