package com.design.factory.factoryMethod;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @Author:Madg
 * @Date:2018/11/12/012 23:05
 */
public class PizzaTest
{
    @Test
    public void test()
    {
        PizzaStore pizzaStore=new CaliforniaPizzaStore();
        Pizza pizza=pizzaStore.createPizza();
        System.out.println(pizza);

        pizzaStore=new NYPizzaStore();
        pizza=pizzaStore.createPizza();
        System.out.println(pizza);
    }
}