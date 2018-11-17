package com.design.facade;

/**
 * @Author:Madg
 * @Date:2018/11/17/017 22:47
 * 这是一个家庭影院，其主要目的是将所有的组件都组合在一起，然后将所有组件的接口封装成简单的接口给使用者
 * 作用：以前要是想舒服的听收音机，就得先打开爆米花机，然后做爆米花，然后打开收音机，调整音量。。。现在只需要调用listen即可，他会把一大堆的调用封装在一个方法中共使用者调用
 */
public class HomeTheaterFacade
{
    private Amplifier amplifier;
    private PopcorePoper popcorePoper;
    private Tuner tuner;

    public HomeTheaterFacade(Amplifier amplifier, PopcorePoper popcorePoper, Tuner tuner)
    {
        this.amplifier = amplifier;
        this.popcorePoper = popcorePoper;
        this.tuner = tuner;
    }

    public void listen()
    {
        //做爆米花
        popcorePoper.on();
        popcorePoper.pop();

        //打开收音机
        tuner.on();

        //调整扩音器
        amplifier.on();
        amplifier.setTuner();
        amplifier.setVolume();
    }
}
