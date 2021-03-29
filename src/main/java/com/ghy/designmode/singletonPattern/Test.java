package com.ghy.designmode.singletonPattern;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Test {
    public static void main(String[] args) {
//        Thread t1=new Thread(new ExectorThread());
//        Thread t2=new Thread(new ExectorThread());
//        t1.start();
//        t2.start();
//        System.out.println("结束");

        //反射破坏单例
        Class<?> clazz=Single.class;
        //通过反射拿到私有的构造方法=
        Constructor c= null;
        try {
            c = clazz.getDeclaredConstructor(null);
            //强吻
            c.setAccessible(true);
            //暴力初始化
            Object object=c.newInstance();
            //调用了两次构造方法，相当于 new 了两次
            Object object1=c.newInstance();
            System.out.println(object);
            System.out.println(object1);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

    }
}
