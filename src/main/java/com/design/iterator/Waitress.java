package com.design.iterator;

/**
 * @Author:Madg
 * @Date:2018/11/18/018 21:58
 * 服务员：用于遍历Iterator
 */
public class Waitress
{
    private Iterator<MenuItem> iterator;

    public Waitress(Iterator<MenuItem> iterator)
    {
        this.iterator = iterator;
    }

    public void setIterator(Iterator<MenuItem> iterator)
    {
        this.iterator = iterator;
    }

    public void printMenu()
    {
        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
    }
}
