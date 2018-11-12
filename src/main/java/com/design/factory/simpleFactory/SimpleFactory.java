package com.design.factory.simpleFactory;

/**
 * @Author:Madg
 * @Date:2018/11/12/012 22:45
 *
 * 抽象类，用来创建一个抽象的pizza
 * 在工厂模式中
 */
public class SimpleFactory
{
    public static Pizza createPizza(String type)
    {
        if (type.equals("NewYork"))
        {
            return new NYPizza();
        }
        else if (type.equals("California"))
        {
            return new CaliforniaPizza();
        }
        else
        {
            return null;
        }
    }
}
