package com.ghy.designmode.factoryMethod;

public abstract class Factory {
    /**
     * 让子类（具体工厂）来实例化具体对象
     */
    public abstract Food newFood();
    //菜品
    public void process(String food){
        Food food1=newFood();
        food1.canteen(food);
    }
}
