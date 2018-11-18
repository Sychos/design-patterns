package com.design.iterator;

import com.sun.xml.internal.ws.api.model.MEP;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author:Madg
 * @Date:2018/11/18/018 19:39
 * 这是个煎饼屋的菜单，他最大的特点是用一个ArrayList来存储菜单中的每一个项
 */
public class PancakeHouseMenu
{
    private final List<MenuItem> menuItems;

    public PancakeHouseMenu()
    {
        menuItems = new ArrayList();
        initialize();
    }

    private void initialize()
    {
        addItem(new MenuItem("K&B","Pancake with scrambleb eggs,and toast",true,2.99));
        addItem(new MenuItem("Regular","Pancake with fried eggs,and sausage",false,2.99));
        addItem(new MenuItem("BlueBerrt","Pancake with blueberrt,and toast",true,3.45));
        addItem(new MenuItem("Wffles","Pancake with your choice and toast",true,3.59));
    }

    public void addItem(MenuItem menuItem)
    {
        menuItems.add(menuItem);
    }

    public List<MenuItem> getMenuItems()
    {
        return menuItems;
    }

    //实现迭代器功能
    public Iterator<MenuItem> createIterator()
    {
        return new PancakeHouseIterator(menuItems);
    }
}
