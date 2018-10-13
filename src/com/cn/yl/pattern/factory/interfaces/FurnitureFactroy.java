package com.cn.yl.pattern.factory.interfaces;


import com.cn.yl.pattern.factory.method.ChairFactory;
import com.cn.yl.pattern.factory.pojo.Furniture;
import com.cn.yl.pattern.factory.pojo.Table;


public class FurnitureFactroy implements Factory {
    //自己生产一个产品
    @Override
    public Furniture getTable() {
        return new Table("桌子", (float) 40.34, 30,"四条腿的桌子");
    }
    //结合工厂方法里的工厂接口生产一个产品
    @Override
    public Furniture getChair() {
        return new ChairFactory().getFuniture();
    }
}
