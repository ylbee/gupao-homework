package com.cn.yl.pattern.factory.simple;

import com.cn.yl.pattern.factory.pojo.Furniture;
import com.cn.yl.pattern.factory.pojo.Table;
import com.cn.yl.pattern.factory.pojo.Chair;

//这里是产品生产车间
public class Factory {

    public Furniture getFuniture(String name){
       if(name.equals("Chair")){
            return new Chair("椅子", (float) 20.34, 10,"可旋转的椅子");
        }else if(name.equals("Table")){
           return new Table("桌子", (float) 40.34, 30,"四条腿的桌子");
       }
        return null;
    }
}
