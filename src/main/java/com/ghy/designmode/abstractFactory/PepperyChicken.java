package com.ghy.designmode.abstractFactory;
//具体产品：辣子鸡
public class PepperyChicken implements HunanCuisine {
    @Override
    public void order() {
        System.out.println ("点了辣子鸡");
    }
}
