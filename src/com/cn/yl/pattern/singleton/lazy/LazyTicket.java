package com.cn.yl.pattern.singleton.lazy;
//懒汉式单例 线程不安全的类
//在外部需要使用的时候才进行实例化
public class LazyTicket {
    //构造方法 初始化时使用
    private LazyTicket(int num){
        this.num=num;
    }
    //静态块，公共内存区域
    private static  LazyTicket lazyTicket=null;
    private int num;
    public static LazyTicket getTicket(int num){
        //调用方法之前，先判断
        //如果没有初始化，将其进行初始化,并且赋值
        //将该实例缓存好
        if(null==lazyTicket){
            //两个线程都会进入这个if里面，出现线程不安全情况
            lazyTicket = new LazyTicket(num);
        }
        //如果已经初始化，直接返回之前已经保存好的结果
        return lazyTicket;
    }


}
