package com.ghy.designmode.factoryMethod;

public class Orders {
    public static void main(String[] args) {
        Factory factory=new HunanCuisineFactory();
        factory.process("湘菜");
        Factory factory1=new SichuanCuisineFactory();
        factory1.process("川菜");
    }
}
