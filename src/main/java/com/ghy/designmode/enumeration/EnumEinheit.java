package com.ghy.designmode.enumeration;
//枚举单例
public enum EnumEinheit {
    INSTANCE;
    private Object data;
    public Object getData(){
        return data;
    }
    public void setData(Object data){
        this.data=data;
    }
    public static EnumEinheit getInstance(){
        return INSTANCE;
    }
}
