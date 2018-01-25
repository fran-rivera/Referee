package com.hk.notBeFooled.model;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix="category")
public class Category {

    private double Tercera;

    public double getTercera() {
        return Tercera;
    }
}
