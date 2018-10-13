package com.cn.yl.pattern.factory.method;

import com.cn.yl.pattern.factory.pojo.Furniture;
import com.cn.yl.pattern.factory.pojo.Table;

//具体的产品生产
public class TableFactory implements Factory {
    @Override
    public Furniture getFuniture() {
        return new Table("桌子", (float) 40.34, 30,"四条腿的桌子");
    }
}
