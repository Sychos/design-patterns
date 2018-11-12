package com.design.factory.factoryMethod;

/**
 * @Author:Madg
 * @Date:2018/11/12/012 22:55
 */
public abstract class Pizza
{
    protected String name;
    protected int price;

    @Override
    public String toString()
    {
        return "Pizza{" + "name='" + name + '\'' + ", price=" + price + '}';
    }
}
