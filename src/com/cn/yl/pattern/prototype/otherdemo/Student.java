package com.cn.yl.pattern.prototype.otherdemo;

import java.io.Serializable;

public class Student implements  Cloneable {


    private Grade grade;

    public Student(Grade grade) {
        this.grade = grade;
    }

    public Grade getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }

}
