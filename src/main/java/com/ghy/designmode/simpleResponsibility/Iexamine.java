package com.ghy.designmode.simpleResponsibility;

public interface Iexamine{

    //检查身高
    void setHeight(double height);

    double getHeight();
    //检查体重
    void setWeight(double weight);

    double getWeight();
    //心率是否正常
    boolean testHeartRate(int  number);

}
