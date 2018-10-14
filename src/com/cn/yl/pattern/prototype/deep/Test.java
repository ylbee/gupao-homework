package com.cn.yl.pattern.prototype.deep;

public class Test {
    public static void main(String[] args) {
        try {
            SunWuKong sunWuKong = new SunWuKong(new JinGuBang());
            SunWuKong monkey = sunWuKong.clone();
            System.out.println("孙悟空的金箍棒"+sunWuKong.jinGuBang);
            System.out.println("克隆猴的金箍棒"+monkey.jinGuBang);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
