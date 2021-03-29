package com.ghy.designmode.abstractFactory;
//具体工厂：一日三餐餐厅
public class Meals implements Canteen{
    @Override
    public HunanCuisine newHunanCuisine() {
        return new ShreddedMeat();
    }

    @Override
    public SichuanCuisine newSichuanCuisine() {
        return new TwiceCookedPork();
    }
}
