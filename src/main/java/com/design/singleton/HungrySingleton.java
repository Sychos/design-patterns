package com.design.singleton;

/**
 * @Author:Madg
 * @Date:2018/11/13/013 23:26
 * 饿汗模式：为解决多线程的问题，想到了直接在类加载是就初始化的方式，此模式适用于多线程情形下对资源不会太敏感（因为类加载时就实例化）的情况。
 */
public class HungrySingleton
{
    private static HungrySingleton instance=new HungrySingleton();

    private HungrySingleton(){}

    public static HungrySingleton getInstance()
    {
        return instance;
    }
}
