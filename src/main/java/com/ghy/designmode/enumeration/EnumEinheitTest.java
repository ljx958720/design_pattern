package com.ghy.designmode.enumeration;


import java.lang.reflect.Constructor;

public class EnumEinheitTest {
    public static void main(String[] args) {

//        try {
//            EnumEinheit enumEinheit=null;
//            EnumEinheit enumEinheit1=EnumEinheit.getInstance();
//            enumEinheit1.setData(new Object());
//
//            FileOutputStream fos=new FileOutputStream("ghy");
//            ObjectOutputStream oos=new ObjectOutputStream(fos);
//            oos.writeObject(enumEinheit1);
//            oos.flush();
//            oos.close();
//
//            FileInputStream fis=new FileInputStream("ghy");
//            ObjectInputStream ois=new ObjectInputStream(fis);
//            enumEinheit= (EnumEinheit) ois.readObject();
//            ois.close();
//
//            System.out.println(enumEinheit==enumEinheit1);
//
//        }catch (Exception e){
//            e.printStackTrace();
//        }
        try {
           Class clazz=EnumEinheit.class;
            Constructor c = clazz.getDeclaredConstructor(String.class,int.class);
            c.setAccessible(true);
            c.newInstance();

        }catch (Exception e){
            e.printStackTrace();
        }


    }
}
