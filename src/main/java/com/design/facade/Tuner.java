package com.design.facade;

/**
 * @Author:Madg
 * @Date:2018/11/17/017 22:49
 * 这是收音机
 */
public class Tuner
{
    public void on(){
        System.out.println("Tuner on.");
    };
    public void off(){
        System.out.println("Tuner off.");
    };
    public void setAM(){};
    public void steFM(){};
    public void setFrequency(){};
    public String toString(){return "Tuner";};
}
