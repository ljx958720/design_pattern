package com.ghy.designmode.simpleFactory;

public class SimpleFactory {
//    public Cuisine add(String type){
//        if (type.equalsIgnoreCase("Greens")) {
//            return new Greens();
//        } else if (type.equalsIgnoreCase("Meat")) {
//            return new Meat();
//        } else {
//            System.out.println("没点这个菜");
//            return null;
//        }
//    }
     public Cuisine add(Class<? extends Cuisine> clazz){
         if (null!=clazz){
             try{
                 return clazz.newInstance();
             }catch (Exception e){
             e.printStackTrace();
             }
         }
         return null;
    }
}
