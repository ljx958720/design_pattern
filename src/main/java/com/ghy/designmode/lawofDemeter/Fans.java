package com.ghy.designmode.lawofDemeter;
//粉丝
public class Fans {
    private String name;
    Fans(String name)
    {
        this.name=name;
    }
    public String getName()
    {
        return name;
    }
}
