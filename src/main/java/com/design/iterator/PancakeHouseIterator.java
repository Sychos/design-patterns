package com.design.iterator;

import java.util.List;

/**
 * @Author:Madg
 * @Date:2018/11/18/018 21:42
 * 煎饼屋迭代器
 */
public class PancakeHouseIterator implements Iterator<MenuItem>
{
    private List<MenuItem> items;
    private int position=0;

    public PancakeHouseIterator(List<MenuItem> items)
    {
        this.items = items;
    }

    @Override
    public boolean hasNext()
    {
        if (position>= items.size())
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
        MenuItem menuItem=items.get(position);
        position++;
        return menuItem;
    }
}
