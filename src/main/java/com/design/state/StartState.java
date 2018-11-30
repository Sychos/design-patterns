package com.design.state;

/**
 * @Author:Madg
 * @Date:2018/11/30/030 21:00
 */
public class StartState implements State
{
    @Override
    public void doAction(Context context)
    {
        System.out.println("Player is in start state");
        context.setState(this);
    }

    @Override
    public String toString()
    {
        return "Start State";
    }
}
