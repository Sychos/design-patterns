package com.design.facade;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @Author:Madg
 * @Date:2018/11/17/017 23:07
 */
public class HomeTheaterFacadeTest
{

    @Test
    public void listen()
    {
        HomeTheaterFacade homeTheaterFacade=new HomeTheaterFacade(new Amplifier(),new PopcorePoper(),new Tuner());

        homeTheaterFacade.listen();
    }
}