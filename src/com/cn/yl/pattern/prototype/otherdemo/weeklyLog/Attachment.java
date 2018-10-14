package com.cn.yl.pattern.prototype.otherdemo.weeklyLog;

//附件类
class Attachment
{
    private  String name; //附件名
    public  void setName(String name)
    {
        this.name  = name;
    }
    public  String getName()
    {
        return  this.name;
    }
    public void download()
    {
        System.out.println("下载附件，文件名为" + name);
    }
}
