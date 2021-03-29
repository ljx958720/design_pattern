package com.ghy.designmode.liskovSubstitution;

import java.util.HashMap;
import java.util.Map;

public abstract class Father {
    public abstract Map hello();
    public static void main(String[] args) {
        Father father = new Son();
        father.hello();
    }
}
class Son extends Father {
    @Override
    public Map hello() {
        HashMap map = new HashMap();
        System.out.println("son execute");
        return map;
    }
}
