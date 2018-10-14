package com.cn.yl.pattern.prototype.simple;

//浅克隆 金箍棒公用一个
public class SunWuKong implements Cloneable{

    JinGuBang jinGuBang;

    public SunWuKong(JinGuBang jinGuBang) {
        this.jinGuBang = jinGuBang;
    }

    protected  SunWuKong clone() throws CloneNotSupportedException{
        return (SunWuKong) super.clone();
    }


}
