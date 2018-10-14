package com.cn.yl.pattern.prototype.otherdemo.weeklyLog;

import com.cn.yl.pattern.prototype.otherdemo.Grade;
import com.cn.yl.pattern.prototype.otherdemo.Student;
import com.cn.yl.pattern.prototype.otherdemo.StudentShallowClone;

public class Client {
    public  static void main(String args[])
    {
        WeeklyLog  log_previous, log_new;
        log_previous  = new WeeklyLog(); //创建原型对象
        Attachment  attachment = new Attachment(); //创建附件对象
        log_previous.setAttachment(attachment);  //将附件添加到周报中
        try {
            log_new  = log_previous.clone(); //调用克隆方法创建克隆对象
            //比较周报
            System.out.println("周报是否相同？ " + (log_previous ==  log_new));
            System.out.println("原型周报 " + (log_previous));
            System.out.println("克隆周报 " + (log_new));
            //比较附件
            System.out.println("附件是否相同？ " +  (log_previous.getAttachment() == log_new.getAttachment()));
            System.out.println("原型的附件 " +  (log_previous.getAttachment()));
            System.out.println("克隆的附件 " +  (log_new.getAttachment()));
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

    }


}
