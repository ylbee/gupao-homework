package com.cn.yl.pattern.factory.simple;



//大杂烩工厂，什么都生产
public class Customer {

    public static void main(String[] args) {
        System.out.println("简单工厂---》家具购买清单：");
        Factory factory = new Factory();
        System.out.println(factory.getFuniture("Chair"));
        System.out.println(factory.getFuniture("Table"));



    }
}
