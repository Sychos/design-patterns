package com.design.composite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Author:Madg
 * @Date:2018/11/19/019 21:32
 * 这是菜单类
 */
public class Menu extends Composite
{
    private List<Composite> menuComposite;

    private String name;
    private String description;

    public Menu(String name, String description)
    {
        menuComposite=new ArrayList<>();
        this.name = name;
        this.description = description;
    }

    public void add(Composite composite)
    {
        menuComposite.add(composite);
    }

    @Override
    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    @Override
    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public void print()
    {
        System.out.print("\n"+getName());
        System.out.println(","+getDescription());
        System.out.println("--------------------");

        Iterator<Composite> iterator=menuComposite.iterator();
        while (iterator.hasNext())
        {
            Composite menu= iterator.next();
            menu.print();
        }
    }
}
