package com.cn.yl.pattern.prototype.deep;

import java.io.*;

//浅克隆 自己引用自己的时候就使用了同一个引用了
//孙悟空
public class SunWuKong implements Cloneable, Serializable  {
    //孙悟空可以复制自己
    SunWuKong sunWuKong;
    JinGuBang jinGuBang;
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
