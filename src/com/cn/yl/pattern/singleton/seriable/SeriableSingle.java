package com.cn.yl.pattern.singleton.seriable;

import java.io.Serializable;

//序列化之后再反序列化回来会重新new一个实例
// 反序列化时导致单例破坏
public class SeriableSingle implements Serializable {
    //序列化就是说把内存中的状态通过转换成字节码的形式
    //从而转换一个IO流，写入到其他地方(可以是磁盘、网络IO)
    //内存中状态给永久保存下来了

    //反序列化
    //讲已经持久化的字节码内容，转换为IO流
    //通过IO流的读取，进而将读取的内容转换为Java对象
    //转在换程中过会重新创建对象new
    private SeriableSingle(){}

    private static final SeriableSingle instance = new SeriableSingle();

    public static SeriableSingle getInstance(){
        return instance;
    }

    //通过写这个方法得到发序列化时依然得到已存在的instance
    //ObjectInputStream 中反射时有判断是否包含这个方法
    private Object readResolve(){
        return instance;
    }
}
