package com.design.observer;

import java.util.List;
import java.util.Vector;

/**
 * @Author:Madg
 * @Date:2018/11/11/011 15:51
 */
public class WeatherData implements Subject
{
    private List<Observer> registers;

    private float temprature;
    private float humdity;
    private float pressure;

    public WeatherData()
    {
        registers=new Vector<>();
    }

    @Override
    public void addObserver(Observer observer)
    {
        registers.add(observer);
    }

    @Override
    public void removeObjserver(Observer observer)
    {
        if (registers.contains(observer))
        {
            registers.remove(observer);
        }
    }

    @Override
    public void notifyObservers()
    {
        for (Observer observer:registers)
        {
            observer.update(temprature,humdity,pressure);
        }
    }

    //模拟数据变化
    public void setData(float temprature,float humdity,float pressure)
    {
        this.temprature=temprature;
        this.humdity=humdity;
        this.pressure=pressure;
        //发布更新
        notifyObservers();
    }
}
