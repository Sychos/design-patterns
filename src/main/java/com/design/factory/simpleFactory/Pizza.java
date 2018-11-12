package com.design.factory.simpleFactory;

/**
 * @Author:Madg
 * @Date:2018/11/12/012 22:46
 * 具体要创建的对象，及披萨
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
