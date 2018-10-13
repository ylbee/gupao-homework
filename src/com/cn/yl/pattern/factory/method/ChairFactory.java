package com.cn.yl.pattern.factory.method;

import com.cn.yl.pattern.factory.pojo.Chair;
import com.cn.yl.pattern.factory.pojo.Furniture;

//具体的产品生产
public class ChairFactory implements Factory {
    @Override
    public Furniture getFuniture() {
        return new Chair("椅子", (float) 20.34, 10,"可旋转的椅子");
    }
}
