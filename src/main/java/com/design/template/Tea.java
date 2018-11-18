package com.design.template;

/**
 * @Author:Madg
 * @Date:2018/11/18/018 19:24
 */
public class Tea extends Beverage
{
    @Override
    protected void brew()
    {
        System.out.println("Brew tea with boilWater");
    }

    @Override
    protected void addCondiments()
    {
        System.out.println("Add sugar");
    }

    //用冰水
    @Override
    public boolean userCoolWater()
    {
        return true;
    }
}
