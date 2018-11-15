package com.design.command;

/**
 * @Author:Madg
 * @Date:2018/11/15/015 22:23
 * 客户端(Client)角色：创建一个具体命令(ConcreteCommand)对象并确定其接收者。
 * 这里模拟的是顾客，他负责填写菜单，并说要哪个厨师炒
 */
public class Client
{
    public static void main(String[] args)
    {
        //创建接收者（厨师）
        Receiver receiver = new Receiver();

        //创建命令对象，设定它的接收者（菜单-->要哪个厨师做）
        Command command = new ConcreteCommand(receiver);

        //创建请求者，把命令对象设置进去（服务员把菜单拿走了）
        Invoker invoker=new Invoker(command);

        //调用（服务员在窗口喊了一声“菜单到了”）
        invoker.action();
    }
}
