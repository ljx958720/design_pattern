package com.ghy.designmode.simpleFactory;

public class Invoking {
    public static void main(String[] args) {
//        //点了个青菜
//        Cuisine cuisine=new Greens();
//        cuisine.menu();
//        //点了个肉
//        Cuisine cuisine1=new Greens();
//        cuisine1.menu();
        SimpleFactory simpleFactory=new SimpleFactory();
        Cuisine cuisine=simpleFactory.add(Greens.class);
        cuisine.menu();
    }
}
