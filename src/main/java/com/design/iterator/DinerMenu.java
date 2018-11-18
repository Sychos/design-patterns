package com.design.iterator;

/**
 * @Author:Madg
 * @Date:2018/11/18/018 19:50
 * 晚餐菜单，它最大的特征是用一个数组来存储菜单项
 */
public class DinerMenu
{
    private static final int MAX_ITEMS=5;
    private  int numberOfItems=0;
    MenuItem[] menuItems;

    public DinerMenu()
    {
        menuItems=new MenuItem[MAX_ITEMS];
        initialize();
    }

    private void initialize()
    {
        //菜名乱写的
        addItem(new MenuItem("A&C","Pancake with scrambleb eggs,and toast",true,12.99));
        addItem(new MenuItem("Regular","Pancake with fried eggs,and sausage",false,12.99));
        addItem(new MenuItem("BlueBerrt","Pancake with blueberrt,and toast",true,13.45));
        addItem(new MenuItem("Wffles","Pancake with your choice and toast",true,13.59));
    }

    public void addItem(MenuItem menuItem)
    {
        if (numberOfItems>=MAX_ITEMS)
        {
            System.out.println("Sorry,menu is full");
        }
        else
        {
            menuItems[numberOfItems]=menuItem;
            numberOfItems++;
        }
    }

    public MenuItem[] getMenuItems()
    {
        return menuItems;
    }

    //实现迭代器功能
    public Iterator<MenuItem> createIterator()
    {
        return new DinerIterator(menuItems);
    }
}
