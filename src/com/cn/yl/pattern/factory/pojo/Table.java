package com.cn.yl.pattern.factory.pojo;

public class Table extends Furniture {
    private String  details;

    public Table(String name, float price, int size, String details) {
        super(name, price, size);
        this.details = details;
    }


    public String toString() {
        return "Table{" +
                "details='" + details + '\'' +super.toString()+
                '}';
    }

}
