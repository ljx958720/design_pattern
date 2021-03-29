package com.ghy.designmode.singletonPattern;

//这种形式兼顾饿汉式的内存浪费，也兼顾 synchronized 性能问题
// 完美地屏蔽了这两个缺点
public class Single {


    //默认使用 Single 的时候，会先初始化内部类
    //如果没使用的话，内部类是不加载的
    private Single(){
        //在构造方法中加入判断
        if(getInstance.INSTANCE != null)
        { throw new RuntimeException("已经有对象了"); }

    }
    //每一个关键字都不是多余的
    // static 是为了使单例的空间共享
    // 保证这个方法不会被重写，重载
    public static final Single getInstance(){
        //在返回结果以前，一定会先加载内部类
        return getInstance.INSTANCE;
        }
    //默认不加载
    private static class getInstance{
        private static final Single INSTANCE = new Single();
    }
}
