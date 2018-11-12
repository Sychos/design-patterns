package com.design.observer;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @Author:Madg
 * @Date:2018/11/11/011 15:58
 */
public class WeatherDataTest
{
    @Test
    public void test()
    {
        //初始化
        Subject subject=new WeatherData();

        //注册第一个观察者
        Observer observer=new CurrentConditionDisplay(subject);
        //注册第二个观察者
        Observer observer2=new StatisticDisplay(subject);

        //第一次发布更新
        ((WeatherData) subject).setData(11.2f,12.3f,11.2f);

        //第二次发布更新
        ((WeatherData) subject).setData(22.2f,32.3f,33.2f);

        //Current conditions: 11.2℃ and 12.3humdity
        //Statistic Datas: 11.2℃ and 12.3humdity and 11.2
        //Current conditions: 22.2℃ and 32.3humdity
        //Statistic Datas: 22.2℃ and 32.3humdity and 33.2
    }
}