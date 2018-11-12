package com.design.factory.factoryMethod;

/**
 * @Author:Madg
 * @Date:2018/11/12/012 23:04
 */
public class CaliforniaPizzaStore extends PizzaStore
{
    @Override
    public Pizza createPizza()
    {
        //todo
        return new CaliforniaPizza();
    }
}
