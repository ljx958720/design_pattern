package com.ghy.designmode.liskovSubstitution;

import java.util.ArrayList;

public class ParentClazz {
    public void say(String  str) {
        System.out.println("parent execute say " + str);
    }
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        ParentClazz parent = new ParentClazz();
        parent.say("hello1");
        ChildClazz child = new ChildClazz();
        child.say("hello");

    }
}
 class ChildClazz extends ParentClazz {
    public void say(Object str) {
        System.out.println("child execute say " + str);
    }
}
