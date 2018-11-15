package com.design.command;

/**
 * @Author:Madg
 * @Date:2018/11/15/015 22:19
 * 定义一个接收者和行为之间的弱耦合；实现execute()方法，负责调用接收者的相应操作。execute()方法通常叫做执行方法。
 * 案例中代表的是【菜单】，
 */
public class ConcreteCommand implements Command
{
    //接受者（厨师）
    Receiver receiver;

    public ConcreteCommand(Receiver receiver)
    {
        this.receiver = receiver;
    }

    @Override
    public void excute()
    {
        //这里是厨师做菜
        receiver.action();
    }
}
