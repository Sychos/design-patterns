package com.design.adapter;

import org.junit.Test;

import java.util.Arrays;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;

/**
 * @Author:Madg
 * @Date:2018/11/17/017 22:11
 */
public class IteratorAdaptorTest
{
    @Test
    public void test()
    {
        List<String> list= Arrays.asList("a","b","c");

        Iterator<String> iterator=list.iterator();
        Enumeration<String> enu=new IteratorAdapter<>(iterator);

        while (enu.hasMoreElements())
        {
            System.out.println(enu.nextElement());
        }
    }
}