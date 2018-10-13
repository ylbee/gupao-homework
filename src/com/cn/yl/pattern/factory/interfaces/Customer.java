package com.cn.yl.pattern.factory.interfaces;



//
public class Customer {

    public static void main(String[] args) {
        System.out.println("接口实现---》家具购买清单：");
        Factory factory =new FurnitureFactroy();
        System.out.println(factory.getTable());
        System.out.println(factory.getChair());
    }
}
