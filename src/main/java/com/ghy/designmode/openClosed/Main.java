package com.ghy.designmode.openClosed;

// 测试
public class Main {
    public static void main(String[] args) {
        ICourse course = new EnglishCourse("小学英语", 199D, "必修");
        System.out.println(
                "课程名字:"+course.getName() + " " +
                        "课程价格:"+course.getPrice() + " " +
                        "课程类型:"+course.getType()
        );
        ICourse saleEnglishCourse = new SaleEnglishCourse ("小学英语", 199D, "必修");
        System.out.println(
                "课程名字:"+saleEnglishCourse.getName() + " " +
                        "课程价格:"+saleEnglishCourse.getPrice() + " " +
                        "课程类型:"+saleEnglishCourse.getType()
        );
    }
}
