package com.ghy.designmode.factoryMethod;
//具体产品（湘菜）
public class HunanCuisine implements Food{
    @Override
    public void canteen(String type) {
        System.out.println("点了湘菜");
    }
}
