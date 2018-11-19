package com.design.composite;

/**
 * @Author:Madg
 * @Date:2018/11/19/019 21:14
 * 每个接口方法默认都会抛出异常，目的是为了有些子类不用实现不用的方法。
 * 下面注释中的a主要是菜单中的方法，而b则是菜单项中的方法
 * 此接口将会包含菜单和菜单项的所有行为，目的是菜单和菜单项都实现它后，在菜单中添加菜单就像在菜单中添加菜单项一样方便
 */
public abstract class Composite
{
    //a
    public void add(Composite composite)
    {
        throw new UnsupportedOperationException();
    }


    //a
    public void remove(Composite composite)
    {
        throw new UnsupportedOperationException();
    }


    //a
    public Composite getChild(int i)
    {
        throw new UnsupportedOperationException();
    }


    //a,b
    public String getName()
    {
        throw new UnsupportedOperationException();
    }

    //a,b
    public String getDescription()
    {
        throw new UnsupportedOperationException();
    }


    //b
    public double getPrice()
    {
        throw new UnsupportedOperationException();
    }

    //b
    public boolean isVegetarian()
    {
        throw new UnsupportedOperationException();
    }
    //a,b
    public void print()
    {
        throw new UnsupportedOperationException();
    }
}
