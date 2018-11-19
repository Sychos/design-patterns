package com.design.composite;

import com.design.iterator.PancakeHouseMenu;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @Author:Madg
 * @Date:2018/11/19/019 21:41
 */
public class WaitressTest
{

    @Test
    public void printMenu()
    {
        Menu menu= new Menu("Menu1","This is menu 1");
        Menu menu2= new Menu("Menu2","This is menu 2");

        menu2.add(new MenuItem("item1","this is a item1",true,2.99));
        menu2.add(new MenuItem("item2","this is a item2",true,1.99));

        Menu menu3= new Menu("Menu3","This is menu 3");

        Menu menuAll=new Menu("All menus","All menus");
        menuAll.add(menu);
        menuAll.add(menu2);
        menuAll.add(menu3);

        Waitress waitress=new Waitress(menuAll);
        waitress.printMenu();

        //All menus,All menus
        //--------------------
        //
        //Menu1,This is menu 1
        //--------------------
        //
        //Menu2,This is menu 2
        //--------------------
        //  item1(v),2.99
        //  --this is a item1
        //  item2(v),1.99
        //  --this is a item2
        //
        //Menu3,This is menu 3
        //--------------------
    }
}