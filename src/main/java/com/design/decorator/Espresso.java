package com.design.decorator;

/**
 * @Author:Madg
 * @Date:2018/11/11/011 23:04
 * 第一种具体被装饰者：浓缩咖啡
 */
public class Espresso extends Beverage
{
    //为保证区分名字，此处在构造方法中更新介绍
    public Espresso()
    {
        description="Espresso";
    }

    @Override
    protected float getCost()
    {
        return 1.99f;
    }
}
