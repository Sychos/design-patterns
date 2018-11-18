package com.design.adapter;

import org.junit.Test;

/**
 * @Author:Madg
 * @Date:2018/11/17/017 20:20
 * 模拟丑小鸭变黑天鹅
 */
public class SwanAdapterTest
{
    @Test
    public void test()
    {
        //初始化丑小鸭和黑天鹅
        Duck uglyDuck=new UglyDuck();
        uglyDuck.quck();
        uglyDuck.fly();
        //变天鹅
        Swan adaptor=new SwanAdapter(uglyDuck);
        adaptor.cluck();
        adaptor.fly();
    }


}