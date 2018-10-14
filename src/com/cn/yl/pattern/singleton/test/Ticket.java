package com.cn.yl.pattern.singleton.test;
//普通的类
public class Ticket {
    private int mun;

    private Ticket(int mun) {
        this.mun = mun;
    }

    public Ticket() {
    }

    public int getMun() {
        return mun;
    }

}
