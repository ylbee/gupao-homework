package com.cn.yl.pattern.prototype.deep;

public class Test {
    public static void main(String[] args) {
        try {
            SunWuKong sunWuKong = new SunWuKong();
            sunWuKong.sunWuKong = new SunWuKong();
            sunWuKong.sunWuKong.jinGuBang=new JinGuBang();
            System.out.println("孙悟空的金箍棒"+sunWuKong.sunWuKong.jinGuBang);
            SunWuKong monkey = sunWuKong.clone();
            System.out.println("克隆猴子金箍棒"+monkey.sunWuKong.jinGuBang);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
