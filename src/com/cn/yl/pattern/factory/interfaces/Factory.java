package com.cn.yl.pattern.factory.interfaces;

import com.cn.yl.pattern.factory.pojo.Furniture;
//不是抽象类用接口代替，为什么不这样考虑
public interface Factory {

    public abstract Furniture getTable();

    public abstract Furniture getChair();
}
