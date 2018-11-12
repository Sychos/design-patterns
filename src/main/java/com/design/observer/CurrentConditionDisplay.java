package com.design.observer;

/**
 * @Author:Madg
 * @Date:2018/11/11/011 15:42
 */
public class CurrentConditionDisplay implements Observer,Displayable
{
    private float tempprature;
    private float humdity;

    private Subject subject;

    public CurrentConditionDisplay(Subject subject)
    {
        this.subject = subject;
        //初始化时就注册进去
        subject.addObserver(this);
    }

    @Override
    public void update(float temp, float humdity, float pressure)
    {
        this.tempprature=temp;
        this.humdity=humdity;

        display();
    }

    @Override
    public void display()
    {
        System.out.println("Current conditions: "+tempprature+"℃ and "+humdity+"humdity");
    }
}
