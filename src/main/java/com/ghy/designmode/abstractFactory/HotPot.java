package com.ghy.designmode.abstractFactory;

//具体产品：火锅
public class HotPot implements SichuanCuisine {
    @Override
    public void order() {
        System.out.println ("点了火锅");
    }
}
