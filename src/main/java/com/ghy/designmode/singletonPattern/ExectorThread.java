package com.ghy.designmode.singletonPattern;

public class ExectorThread implements Runnable {
    @Override
    public void run() {
        Idler idler=  Idler.getInstance();
        System.out.println(Thread.currentThread().getName()+":"+idler);
    }
}
