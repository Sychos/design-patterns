package com.design.iterator;

/**
 * @Author:Madg
 * @Date:2018/11/18/018 21:32
 * 晚餐迭代器
 */
public class DinerIterator implements Iterator<MenuItem>
{
    private MenuItem[] items;
    private int position;

    public DinerIterator(MenuItem[] items)
    {
        this.items = items;
    }

    @Override
    public boolean hasNext()
    {
        if (position>=items.length || items[position]==null)
        {
            return false;
        }
        else
        {
            return true;
        }
    }

    @Override
    public MenuItem next()
    {
        MenuItem item=items[position];
        position++;
        return item;
    }
}
