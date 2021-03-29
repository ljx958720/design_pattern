package com.ghy.designmode.lawofDemeter;

public class Star {
    private String name;
    Star(String name) {
        this.name=name;
    }
    public String getName()
    {
        return name;
    }
}
