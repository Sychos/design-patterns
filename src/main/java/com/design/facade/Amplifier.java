package com.design.facade;

/**
 * @Author:Madg
 * @Date:2018/11/17/017 22:56
 * 这是个扩音器
 */
public class Amplifier
{
    private Tuner tuner;

    public void on(){
        System.out.println("Amplifier on.");
    }
    public void off(){
        System.out.println("Amplifier off.");
    }
    public void setTuner(){}
    public void setVolume(){}
    public String toString(){return "Amplifier";}
}
