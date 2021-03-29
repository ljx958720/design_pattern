package com.ghy.designmode.abstractFactory;
//抽象工厂：餐厅
public interface Canteen {
     HunanCuisine newHunanCuisine();
    SichuanCuisine newSichuanCuisine();
}
