package com.ghy.designmode.dependenceInversion;

public class Client {
    public static void main(String[] args) {
//        Driver zhangsan = new Driver();
//        Benz benz = new Benz();
//        // 张三开车
//        zhangsan.drive(benz);

        IDriver zhangsan = new Driver();
        Benz benz = new Benz();
        zhangsan.drive(benz);

        BMW bmw = new BMW();
        zhangsan.drive(bmw);
    }
}
