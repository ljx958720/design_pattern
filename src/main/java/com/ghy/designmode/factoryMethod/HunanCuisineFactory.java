package com.ghy.designmode.factoryMethod;
//湘菜餐厅
public class HunanCuisineFactory extends Factory{
    @Override
    public Food newFood() {
        return new HunanCuisine();
    }
}
