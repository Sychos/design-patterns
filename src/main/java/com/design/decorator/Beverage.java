package com.design.decorator;

/**
 * @Author:Madg
 * @Date:2018/11/11/011 22:45
 * 被装饰者抽象类，最好是一个接口，但是涉及到后期被装饰的类往往是前期遗留下来的，所以是接口的可能性较小，所以此处用抽象类
 * 作用：为了统一装饰类型,以咖啡为例，就是饮料。
 *
 * 在装饰着模式中此类的名字可以统一写成 [Component]
 */
public abstract class Beverage
{
    //介绍
    protected String description="Unknown Beverage";

    //饮料价格
    private float cost;

    public String getDescription()
    {
        return description;
    }

    protected abstract float getCost();
}
