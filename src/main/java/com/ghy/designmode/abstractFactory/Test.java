package com.ghy.designmode.abstractFactory;

public class Test {
    public static void main(String[] args) {
        Canteen canteen=new Meals ();
        HunanCuisine hunanCuisine=canteen.newHunanCuisine ();
        hunanCuisine.order ();

        Canteen canteen1=new Meals ();
        SichuanCuisine  hunanCuisine1=canteen1.newSichuanCuisine ();
        hunanCuisine1.order ();

    }
}
