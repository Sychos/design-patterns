package com.design.factory.simpleFactory;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @Author:Madg
 * @Date:2018/11/12/012 22:53
 */
public class PizzaTest
{
    @Test
    public void test()
    {
        Pizza pizza=SimpleFactory.createPizza("California");

        System.out.println(pizza);

        pizza=SimpleFactory.createPizza("NewYork");
        System.out.println(pizza);
    }
}