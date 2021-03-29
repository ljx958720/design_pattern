package com.ghy.designmode.factoryMethod;
//川菜餐厅
public class SichuanCuisineFactory extends Factory{
    @Override
    public Food newFood() {
        return new SichuanCuisine();
    }
}
