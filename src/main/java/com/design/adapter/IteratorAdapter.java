package com.design.adapter;

import java.util.*;

/**
 * @Author:Madg
 * @Date:2018/11/17/017 22:03
 * 这是个将Iterator转换成Enumeration的适配器
 */
public class IteratorAdapter<E> implements Enumeration<E>
{
    private Iterator<E> iterator;

    public IteratorAdapter(Iterator<E> iterator)
    {
        this.iterator = iterator;
    }

    @Override
    public boolean hasMoreElements()
    {
        return iterator.hasNext();
    }

    @Override
    public E nextElement()
    {
        return iterator.next();
    }
}
