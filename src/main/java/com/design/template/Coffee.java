package com.design.template;

/**
 * @Author:Madg
 * @Date:2018/11/18/018 19:26
 */
public class Coffee extends Beverage
{
    @Override
    protected void brew()
    {
        System.out.println("Brew coffee with boilWater");
    }

    @Override
    protected void addCondiments()
    {
        System.out.println("Add milk to coffee");
    }
    //默认用温水，所以hood方法不用管
}
