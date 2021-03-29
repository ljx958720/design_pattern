package com.ghy.designmode.singletonPattern;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationTest {
    public static void main(String[] args) {
        Serialization serialization=Serialization.getInstance();
        Serialization serialization1=null;

        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("ghy");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(serialization);
            oos.flush();
            oos.close();
            FileInputStream fis = new FileInputStream("ghy");
            ObjectInputStream ois = new ObjectInputStream(fis);
            serialization1 = (Serialization)ois.readObject();
            ois.close();
            System.out.println(serialization);
            System.out.println(serialization1);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
