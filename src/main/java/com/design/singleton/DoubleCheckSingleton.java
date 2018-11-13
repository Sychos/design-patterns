package com.design.singleton;

/**
 * @Author:Madg
 * @Date:2018/11/13/013 23:34
 * 双重校验锁：为解决多线程情形下每次访问都会加锁的性能问题采用的实例化方式。
 */
public class DoubleCheckSingleton
{
    private volatile static DoubleCheckSingleton instance;

    private DoubleCheckSingleton(){}

    public static DoubleCheckSingleton getInstance()
    {
        if (instance==null)
        {
            //此处之所以锁住类，而不是对象是因为，当前是有可能没有实例（个人观点）
            synchronized (DoubleCheckSingleton.class)
            {
                //第二次检查变量是否已经被初始化：如果其他线程曾获取过锁，那么变量已被初始化，返回初始化的变量。
                if (instance==null)
                {
                    instance=new DoubleCheckSingleton();
                }
            }
        }

        return instance;
    }
}
