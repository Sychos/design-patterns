package com.design.state;

/**
 * @Author:Madg
 * @Date:2018/11/30/030 20:57
 * Context类：带有某个状态的类
 */
public class Context
{
    private State state;

    public Context()
    {
        state=null;
    }

    public State getState()
    {
        return state;
    }

    public void setState(State state)
    {
        this.state = state;
    }
}
