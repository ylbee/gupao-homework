package com.cn.yl.pattern.factory.abstracts;

import com.cn.yl.pattern.factory.pojo.Furniture;

//把制作家具工厂抽象化
public abstract class Factory {

    public abstract Furniture getTable();

    public abstract Furniture getChair();
}
