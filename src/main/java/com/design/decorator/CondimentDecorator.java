package com.design.decorator;

/**
 * @Author:Madg
 * @Date:2018/11/11/011 22:57
 * 抽象装饰器，为保证装饰类型，继承自统一组建Component
 * 此处的装饰器为调味品
 *
 * 在装饰者模式中，此类的名字可以统一写成 [Decorator]
 */
public abstract class CondimentDecorator extends Beverage
{
    //因为每个调味品的介绍是必须的，所以此处需要修改下，使得每个具体的装饰器必须修改其介绍
    abstract protected String getDecription();
}
