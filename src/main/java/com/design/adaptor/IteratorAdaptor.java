package com.design.adaptor;

import java.util.*;

/**
 * @Author:Madg
 * @Date:2018/11/17/017 22:03
 * 这是个将Iterator转换成Enumeration的适配器
 */
public class IteratorAdaptor<E> implements Enumeration<E>
{
    private Iterator<E> iterator;

    public IteratorAdaptor(Iterator<E> iterator)
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
