package com.cn.yl.pattern.prototype.simple;
//浅克隆 自己引用自己的时候就使用了同一个引用了
//孙悟空
public class SunWuKong implements Cloneable{
    //孙悟空可以复制自己
    SunWuKong sunWuKong;
    JinGuBang jinGuBang;
    protected  SunWuKong clone() throws CloneNotSupportedException{
        return (SunWuKong) super.clone();
    }

}
