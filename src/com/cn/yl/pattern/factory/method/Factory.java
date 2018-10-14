package com.cn.yl.pattern.factory.method;

import com.cn.yl.pattern.factory.pojo.Furniture;

//把工厂定义成接口对外暴露
//把对象的创建和初始化交给工厂对象 也就是各自的流水线生产产品
public interface Factory {

    public Furniture getFuniture();
}
