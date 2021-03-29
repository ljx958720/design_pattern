package com.ghy.designmode.simpleFactory;
//具体产品
public class Greens implements Cuisine{
    @Override
    public void menu() {
        System.out.println("点了个青菜");
    }
}
