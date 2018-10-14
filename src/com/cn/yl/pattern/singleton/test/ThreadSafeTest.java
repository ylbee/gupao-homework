package com.cn.yl.pattern.singleton.test;

import com.cn.yl.pattern.singleton.lazy.LazyTicketSafe;
import com.cn.yl.pattern.singleton.register.BeanFactory;
import com.cn.yl.pattern.singleton.register.RegisterSingle;

import java.util.concurrent.CountDownLatch;

public class ThreadSafeTest {
    public static void main(String[] args) {
        int n=1000;
        //发令枪，我就能想到运动员
        CountDownLatch latch=new CountDownLatch(n);
        long start=System.currentTimeMillis();
        for (int i=0;i<n;i++){
            new Thread(){
                @Override
                public void run() {
                    try {
                        //先阻塞，等到count=0时一起执行
                        // count = 0 就会释放所有的共享锁
                        // 万箭齐发
                        latch.await();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    //必然会调用，可能会有很多线程同时去访问getTicket（）
                    // Object ticcket= HungryTicket.getTicket();
                    //Object ticcket= LazyTicket.getTicket(10);
                    //Object ticcket= LazyTicketSafe.getTicket();
                    Object ticcket= BeanFactory.getBean("com.cn.yl.pattern.singleton.test.Ticket");
                    System.out.println(System.currentTimeMillis() +"-----"+ticcket);
                }
            }.start();//每循环一次，就启动一个线程,具有一定的随机性

            //每次启动一个线程，count --
            latch.countDown();
        }
        long end=System.currentTimeMillis();
        //看执行时间
        System.out.println(end-start);
    }
}
