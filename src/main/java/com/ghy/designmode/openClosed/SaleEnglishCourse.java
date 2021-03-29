package com.ghy.designmode.openClosed;

public class SaleEnglishCourse extends EnglishCourse {

    public SaleEnglishCourse(String name, Double price, String author) {
        super(name, price, author);
    }

    @Override
    public Double getPrice() {
        return super.getPrice() * 0.85;
    }
}
