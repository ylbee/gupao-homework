package com.cn.yl.pattern.prototype.otherdemo;

public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {

        // 浅克隆
        Grade g = new Grade();
        StudentShallowClone sscProtype = new StudentShallowClone(g);
        Student sscProtypeClone = sscProtype.clone();
        // 年级信息指向同一个对象
        System.out.println(sscProtype.getGrade().equals(sscProtypeClone.getGrade()));
        System.out.println(sscProtype.getGrade());
        System.out.println(sscProtypeClone.getGrade());

    }


}
