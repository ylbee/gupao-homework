package com.cn.yl.pattern.singleton.test;

import com.cn.yl.pattern.singleton.hungry.HungryTicket;
import com.cn.yl.pattern.singleton.lazy.LazyTicket;
import com.cn.yl.pattern.singleton.lazy.LazyTicketSafe;

import java.lang.reflect.Constructor;

//单例模式保证一个类仅有一个实例， 并提供一个访问它的全局访问点
public class Customer implements Runnable{
    public static void main(String[] args) {
        Object hungryTicket1=HungryTicket.getTicket();
        ((HungryTicket) hungryTicket1).setNum(21);
        Object hungryTicket2=HungryTicket.getTicket();
        ((HungryTicket) hungryTicket2).setNum(22);
        System.out.println("饿汉式单例模式============");
        System.out.println(hungryTicket1==hungryTicket2);
        System.out.println(((HungryTicket) hungryTicket1));
        System.out.println(((HungryTicket) hungryTicket2));

        Object lazyTicket1= LazyTicket.getTicket(10);
        Object lazyTicket2= LazyTicket.getTicket(20);
        System.out.println("懒汉式非线程安全单例模式===========");
        System.out.println(lazyTicket1==lazyTicket2);
        System.out.println(lazyTicket1);
        System.out.println(lazyTicket2);

        Object lazyTicketSafe1 = LazyTicketSafe.getTicket();
        Object lazyTicketSafe2 = LazyTicketSafe.getTicket();
        System.out.println("懒汉式内部加载类线程安全单例模式===========");
        System.out.println(lazyTicketSafe1);
        System.out.println(lazyTicketSafe2);
        System.out.println("暴力new出来的类============");
        //很无聊的情况下，进行破坏
        Class<?> clazz = LazyTicketSafe.class;
        //通过反射拿到私有的构造方法
        Constructor c = null;
        try {
            c = clazz.getDeclaredConstructor(null);
            //强制访问，强吻，不愿意也要吻
            c.setAccessible(true);
            //暴力初始化
            Object ticke1=c.newInstance();
            Object ticke2= c.newInstance();

            System.out.println(ticke1);
            System.out.println(ticke2);


        } catch (Exception e) {
            e.printStackTrace();
        }




    }


    public void run() {

    }
}
