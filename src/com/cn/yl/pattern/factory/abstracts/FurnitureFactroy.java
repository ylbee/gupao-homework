package com.cn.yl.pattern.factory.abstracts;


import com.cn.yl.pattern.factory.method.ChairFactory;
import com.cn.yl.pattern.factory.pojo.Furniture;
import com.cn.yl.pattern.factory.pojo.Table;

//具体的工厂继承抽象工厂实现具体生产
public class FurnitureFactroy extends Factory {
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
