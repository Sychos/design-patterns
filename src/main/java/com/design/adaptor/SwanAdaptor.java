package com.design.adaptor;

/**
 * @Author:Madg
 * @Date:2018/11/17/017 20:15
 * 将鸭子变成天鹅的适配器
 */
public class SwanAdaptor implements Swan
{
    Duck duck;

    public SwanAdaptor(Duck duck)
    {
        this.duck = duck;
    }

    @Override
    public void cluck()
    {
        //鸭子模仿天鹅的叫声
        System.out.println("I'm a Swan");
        duck.quck();
    }

    @Override
    public void fly()
    {
        System.out.println("I'm a Swan");
        //让鸭子飞5此，模仿天鹅的长途飞行能力
        for (int i = 0; i < 5; i++)
        {
            duck.fly();
        }
    }
}
