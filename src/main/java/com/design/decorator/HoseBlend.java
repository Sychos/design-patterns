package com.design.decorator;

/**
 * @Author:Madg
 * @Date:2018/11/11/011 23:04
 * 第二种具体被装饰者：综合咖啡
 */
public class HoseBlend extends Beverage
{
    //为保证区分名字，此处在构造方法中更新介绍
    public HoseBlend()
    {
        description="House Blend coffee";
    }

    @Override
    protected float getCost()
    {
        return 1.22f;
    }
}
