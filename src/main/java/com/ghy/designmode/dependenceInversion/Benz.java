package com.ghy.designmode.dependenceInversion;

//public class Benz {
//    //    车的作用就是跑
//    public void run() {
//        System.out.println("奔驰车跑起来了");
//    }
//}
public class Benz implements Icar {
    //    车的作用就是跑
    public void run() {
        System.out.println("奔驰车跑起来了");
    }
}
