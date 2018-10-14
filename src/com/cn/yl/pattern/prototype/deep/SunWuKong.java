package com.cn.yl.pattern.prototype.deep;

import java.io.*;

//深克隆  利用序列化实现克隆
public class SunWuKong implements Cloneable, Serializable  {

    JinGuBang jinGuBang;

    public SunWuKong(JinGuBang jinGuBang) {
        this.jinGuBang = jinGuBang;
    }

    protected SunWuKong clone() throws CloneNotSupportedException{
        return deepClone();
    }

    private  SunWuKong deepClone() {
        try{
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(this);
            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);
            SunWuKong copy = (SunWuKong)ois.readObject();
            return copy;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }

    }



}
