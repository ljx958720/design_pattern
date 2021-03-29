package com.ghy.designmode.dependenceInversion;

//public class BMW {
//    //    车的作用就是跑
//    public void run() {
//        System.out.println("宝马车跑起来了");
//    }
//}
public class BMW implements Icar {
    //    车的作用就是跑
    public void run() {
        System.out.println("宝马车跑起来了");
    }
}
