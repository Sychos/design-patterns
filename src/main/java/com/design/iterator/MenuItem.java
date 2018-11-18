package com.design.iterator;

/**
 * @Author:Madg
 * @Date:2018/11/18/018 19:42
 * 菜单项类
 */
public class MenuItem
{
    private String name;
    private String description;
    private boolean isVegetarian;
    private double price;

    public MenuItem(String name, String description, boolean isVegetarian, double price)
    {
        this.name = name;
        this.description = description;
        this.isVegetarian = isVegetarian;
        this.price = price;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public boolean isVegetarian()
    {
        return isVegetarian;
    }

    public void setVegetarian(boolean vegetarian)
    {
        isVegetarian = vegetarian;
    }

    public double getPrice()
    {
        return price;
    }

    public void setPrice(double price)
    {
        this.price = price;
    }

    @Override
    public String toString()
    {
        return "MenuItem{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", isVegetarian=" + isVegetarian +
                ", price=" + price +
                '}';
    }
}
