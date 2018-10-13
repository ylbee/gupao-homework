package com.cn.yl.pattern.factory.abstracts;

//工厂生产的各种产品内部封装起来，供客户选择  开闭原则
public class Customer {

    public static void main(String[] args) {
        System.out.println("抽象工厂---》家具购买清单：");
        Factory factory =new FurnitureFactroy();
        System.out.println(factory.getTable());
        System.out.println(factory.getChair());


    }
}
