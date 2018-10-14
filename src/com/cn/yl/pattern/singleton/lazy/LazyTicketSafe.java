package com.cn.yl.pattern.singleton.lazy;
//懒汉式单例  线程安全
//特点：在外部类被调用的时候内部类才会被加载
//内部类一定是要在方法调用之前初始化
//巧妙地避免了线程安全问题

//这种形式兼顾饿汉式的内存浪费，也兼顾synchronized性能问题
//完美地屏蔽了这两个缺点
//史上最牛B的单例模式的实现方式

public class LazyTicketSafe {
    private static  boolean initialized = false;
    //默认使用LazyTicketSafe的时候，会先初始化内部类
    //如果没使用的话，内部类是不加载的
    private LazyTicketSafe(){
        //防止被侵犯
        synchronized (LazyTicketSafe.class){
            if(initialized == false){
                initialized = !initialized;
            }else{
                throw new RuntimeException("单例已被侵犯");
            }
        }

    }
    //每一个关键字都不是多余的
    //static 是为了使单例的空间共享
    //final保证这个方法不会被重写，重载
    public static final LazyTicketSafe getTicket(){
        return lazyHolder.LAZY_TICKET;
    }
    //默认不加载
    private static class lazyHolder{
        private static final LazyTicketSafe LAZY_TICKET = new LazyTicketSafe();
    }
}
