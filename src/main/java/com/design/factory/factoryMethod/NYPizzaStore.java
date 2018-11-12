package com.design.factory.factoryMethod;

/**
 * @Author:Madg
 * @Date:2018/11/12/012 23:02
 */
public class NYPizzaStore extends PizzaStore
{
    @Override
    protected Pizza createPizza()
    {
        //todo
        return new NYPizza();
    }
}
