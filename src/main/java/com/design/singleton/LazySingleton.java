package com.design.singleton;

/**
 * @Author:Madg
 * @Date:2018/11/13/013 23:24
 *
 * 懒汉模式：在不考虑多线程的情况下，其性能应该是最优的
 */
public class LazySingleton
{
    private static LazySingleton instance;

    private LazySingleton()
    {

    }

    public static LazySingleton getInstance()
    {
        if (instance==null)
        {
            instance=new LazySingleton();
        }
        return instance;
    }
}
