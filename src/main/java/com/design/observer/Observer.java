package com.design.observer;

/**
 * @Author:Madg
 * @Date:2018/11/11/011 15:36
 */
public interface Observer
{
    /**
     * 需要更新的数据（此处的数据其实可以封装成一个类）
     * @param temp 温度
     * @param humdity 湿度
     * @param pressure 气压
     */
    void update(float temp,float humdity,float pressure);
}
