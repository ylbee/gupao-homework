package com.cn.yl.pattern.prototype.simple;

public class Test {
    public static void main(String[] args) {
        try {
            SunWuKong sunWuKongPrototype  = new SunWuKong(new JinGuBang());
            SunWuKong sunWuKongClone  = sunWuKongPrototype.clone();
            System.out.println("孙悟空的金箍棒"+sunWuKongPrototype.jinGuBang);
            System.out.println("克隆猴的金箍棒"+sunWuKongClone.jinGuBang);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
