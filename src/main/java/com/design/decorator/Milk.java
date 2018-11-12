package com.design.decorator;

/**
 * @Author:Madg
 * @Date:2018/11/11/011 23:10
 * 第二种调味品：蒸奶
 */
public class Milk extends CondimentDecorator
{
    //用于被装饰的实例
    private Beverage beverage;

    public Milk(Beverage beverage)
    {
        this.beverage = beverage;
        this.description=beverage.getDescription()+",Milk";
    }

    @Override
    public String getDecription()
    {
        return description;
    }

    @Override
    protected float getCost()
    {
        return beverage.getCost()+0.30f;
    }
}
