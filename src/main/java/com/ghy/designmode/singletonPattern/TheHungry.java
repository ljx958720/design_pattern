package com.ghy.designmode.singletonPattern;
//饿汉式

/**
 *优点：没有加任何的锁、执行效率比较高，在用户体验上来说，比懒汉式更好。
 *缺点：类加载的时候就初始化，不管用与不用都占着空间，浪费了内存。
 */
public class TheHungry {
    private static final TheHungry theHungry=new TheHungry();
    private TheHungry(){}
    private static TheHungry getInstance(){
        return theHungry;
    }
}

