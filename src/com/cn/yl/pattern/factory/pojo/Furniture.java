package com.cn.yl.pattern.factory.pojo;

public abstract class  Furniture {

    private String name;
    private float price;
    private int size;

    public Furniture(String name, float price, int size) {
        this.name = name;
        this.price = price;
        this.size = size;
    }


    public String toString() {
        return ", name='" + name + '\'' +
                ", price=" + price +
                ", size=" + size ;
    }
}
