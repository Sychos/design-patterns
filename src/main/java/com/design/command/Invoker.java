package com.design.command;

/**
 * @Author:Madg
 * @Date:2018/11/15/015 22:33
 * 请求者(Invoker)角色：负责调用命令对象执行请求，相关的方法叫做行动方法。
 * 这里模拟服务员（将菜单给柜台，并喊了一声菜单来了，她并不关心哪个厨师做）
 */
public class Invoker
{
    //持有命令对象
    private Command command;

    public Invoker(Command command)
    {
        this.command = command;
    }

    //调用命令
    public void action()
    {
        command.excute();
    }
}
