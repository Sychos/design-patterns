package com.design.composite;

/**
 * @Author:Madg
 * @Date:2018/11/19/019 21:40
 */
public class Waitress
{
    Menu allMenu;

    public Waitress(Menu allMenu)
    {
        this.allMenu = allMenu;
    }
    public void printMenu()
    {
        allMenu.print();
    }
}
