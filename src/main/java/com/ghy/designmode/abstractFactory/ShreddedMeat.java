package com.ghy.designmode.abstractFactory;
//具体产品：鱼香肉丝
public class ShreddedMeat implements HunanCuisine{
    @Override
    public void order() {
        System.out.println ("点了鱼香肉丝");
    }
}
