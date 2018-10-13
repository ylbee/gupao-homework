package com.cn.yl.pattern.factory.method;

//工厂具体化，不同工厂生产不同产品
public class Customer {

    public static void main(String[] args) {
        System.out.println("工厂方法---》家具购买清单：");
        Factory chair = new ChairFactory();
        System.out.println(chair.getFuniture());
        Factory table = new TableFactory();
        System.out.println(table.getFuniture());


    }
}
