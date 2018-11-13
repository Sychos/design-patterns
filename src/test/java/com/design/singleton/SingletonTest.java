package com.design.singleton;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @Author:Madg
 * @Date:2018/11/13/013 23:41
 */
public class SingletonTest
{

    @Test
    public void test()
    {
        //懒汉
        LazySingleton singleton1=LazySingleton.getInstance();
        System.out.println(singleton1.hashCode());

        LazySingleton singleton2=LazySingleton.getInstance();
        System.out.println(singleton2.hashCode());

        //849460928
        //849460928

        //双重校验锁
        DoubleCheckSingleton singleton3=DoubleCheckSingleton.getInstance();
        System.out.println(singleton3.hashCode());
        DoubleCheckSingleton singleton4=DoubleCheckSingleton.getInstance();
        System.out.println(singleton4.hashCode());

        //580024961
        //580024961

        //其他自测
    }
}