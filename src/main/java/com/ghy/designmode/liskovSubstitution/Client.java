package com.ghy.designmode.liskovSubstitution;

public class Client {
    public static void main(String[] args) {
        C c = new C1();
        System.out.println("2+1=" + c.func(2, 1));
    }
}
