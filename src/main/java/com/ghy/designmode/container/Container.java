package com.ghy.designmode.container;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Container {
    private Container(){}
    private static Map<String,Object> ioc=new ConcurrentHashMap<String,Object>();
    public static Object getBean(String className){
        synchronized (ioc){
            if (!ioc.containsKey(className)){
                Object obj=null;
                try {
                    obj = Class.forName(className).newInstance();
                    ioc.put(className, obj);
                }catch (Exception e){
                    e.printStackTrace();
                }
                return obj;
            }else {
                return ioc.get(className);
            }
        }
    }
}
