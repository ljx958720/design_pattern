package com.ghy.designmode.openClosed;

/**
 * 英语课程接口实现
 */
public class EnglishCourse implements ICourse {

    private String name;
    private Double price;
    private String  type;

    public EnglishCourse(String name, Double price, String  type) {
        this.name = name;
        this.price = price;
        this.type = type;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
