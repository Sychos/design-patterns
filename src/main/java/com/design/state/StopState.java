package com.design.state;

/**
 * @Author:Madg
 * @Date:2018/11/30/030 21:05
 */
public class StopState implements State
{
    @Override
    public void doAction(Context context)
    {
        System.out.println("Player is in stop state");
        context.setState(this);
    }

    @Override
    public String toString()
    {
        return "Stop State";
    }
}
