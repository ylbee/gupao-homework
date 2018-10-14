package com.cn.yl.pattern.prototype.otherdemo;

public class StudentShallowClone extends Student {



    public StudentShallowClone(Grade grade) {
        super(grade);
    }


    protected Student clone() throws CloneNotSupportedException {

        return (Student)super.clone();
    }


}
