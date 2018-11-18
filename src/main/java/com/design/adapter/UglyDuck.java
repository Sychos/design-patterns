package com.design.adapter;

/**
 * @Author:Madg
 * @Date:2018/11/17/017 20:20
 * 这是丑小鸭
 */
public class UglyDuck implements Duck
{
    @Override
    public void quck()
    {
        System.out.println("duck quck");
    }

    @Override
    public void fly()
    {
        System.out.println("duck fly");
    }
}
