package com.design.adaptor;

/**
 * @Author:Madg
 * @Date:2018/11/17/017 20:21
 */
public class BlackSwan implements Swan
{
    @Override
    public void cluck()
    {
        System.out.println("swan cluck");
    }

    @Override
    public void fly()
    {
        System.out.println("swan fly");
    }
}
