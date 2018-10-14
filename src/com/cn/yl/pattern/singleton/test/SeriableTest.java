package com.cn.yl.pattern.singleton.test;

import com.cn.yl.pattern.singleton.seriable.SeriableSingle;

import java.io.*;

public class SeriableTest {
    public static void main(String[] args) {
        SeriableSingle ss=SeriableSingle.getInstance();
        try {
            FileOutputStream fos = new FileOutputStream("SeriableSingle");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(ss);
            oos.flush();
            oos.close();

            FileInputStream fis = new FileInputStream("SeriableSingle");
            ObjectInputStream ois = new ObjectInputStream(fis);
            SeriableSingle ss2 = (SeriableSingle)ois.readObject();
            ois.close();

            System.out.println(ss);
            System.out.println(ss2);


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
