package com.ghy.designmode.simpleFactory;
//具体产品
public class Meat implements Cuisine{
    @Override
    public void menu() {
        System.out.println("点个盘肉");
    }
}
