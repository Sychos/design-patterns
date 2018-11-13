package com.design.singleton;

/**
 * @Author:Madg
 * @Date:2018/11/13/013 23:31
 * 方法名加锁的单例模式：能保证多线程模式下正常运行，但是不管第几次调用，每次都会对方法加锁，所以降低系统性能
 */
public class SyncMethodSingleton
{
    private static SyncMethodSingleton instance;

    private SyncMethodSingleton(){}

    public static synchronized SyncMethodSingleton getInstance()
    {
        if (instance==null)
        {
            instance=new SyncMethodSingleton();
        }

        return instance;
    }
}
