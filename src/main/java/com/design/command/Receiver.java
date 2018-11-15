package com.design.command;

/**
 * @Author:Madg
 * @Date:2018/11/15/015 22:16
 * 接收者(Receiver)角色：负责具体实施和执行一个请求。任何一个类都可以成为接收者，实施和执行请求的方法叫做行动方法。
 */
public class Receiver
{
    /**
     * 真正执行命令相应的操作
     */
    public void action(){
        System.out.println("执行操作");
    }
}
