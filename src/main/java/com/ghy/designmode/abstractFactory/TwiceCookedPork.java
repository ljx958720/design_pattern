package com.ghy.designmode.abstractFactory;
//具体产品：回锅肉
public class TwiceCookedPork implements SichuanCuisine{
    @Override
    public void order() {
        System.out.println ("点了回锅肉");
    }
}
