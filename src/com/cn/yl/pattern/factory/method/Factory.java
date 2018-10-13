package com.cn.yl.pattern.factory.method;

import com.cn.yl.pattern.factory.pojo.Furniture;

//把工厂定义成接口对外暴露
public interface Factory {

    public Furniture getFuniture();
}
