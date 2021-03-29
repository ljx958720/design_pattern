package com.ghy.designmode.singletonPattern;
//懒汉式单例

/**
 * 优点：被外部类调用的时候内部类才会加载
 * 缺点：线程不安全
 */
public class Idler {
    private volatile static Idler idler=null; // 声明为volatile类型
    private Idler(){}

    public   static Idler getInstance(){
        if (idler==null){
            synchronized (Idler.class){
                if (idler==null){
                    return idler= new Idler();
                }
            }

        }
        return idler;
    }
}
