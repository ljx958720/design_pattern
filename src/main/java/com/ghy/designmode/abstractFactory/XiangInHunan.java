package com.ghy.designmode.abstractFactory;
//具体工厂：湘里湘亲餐厅
public class XiangInHunan implements Canteen{

    @Override
    public HunanCuisine newHunanCuisine() {
        return new PepperyChicken();
    }

    @Override
    public SichuanCuisine newSichuanCuisine() {
        return new HotPot();
    }
}
