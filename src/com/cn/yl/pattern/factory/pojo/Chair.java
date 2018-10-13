package com.cn.yl.pattern.factory.pojo;

public class Chair extends Furniture {
    private String  details;

    public Chair(String name, float price, int size, String details) {
        super(name, price, size);
        this.details = details;
    }


    public String toString() {
        return "Chair{" +
                "details='" + details + '\'' +super.toString()+
                '}';
    }

}
