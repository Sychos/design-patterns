package com.design.state;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @Author:Madg
 * @Date:2018/11/30/030 21:06
 * 使用 Context 来查看当状态 State 改变时的行为变化。
 */
public class ContextTest
{
    @Test
    public void test()
    {
        Context context=new Context();

        StartState startState=new StartState();
        //状态变化
        startState.doAction(context);
        //行为变化
        System.out.println(context.getState());

        StopState stopState=new StopState();
        //状态变化
        stopState.doAction(context);
        //行为变化
        System.out.println(context.getState());
    }
}