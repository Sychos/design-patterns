package com.design.iterator;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @Author:Madg
 * @Date:2018/11/18/018 22:01
 */
public class WaitressTest
{

    @Test
    public void printMenu()
    {
        DinerMenu dinerMenu=new DinerMenu();
        Iterator<MenuItem> iterator=dinerMenu.createIterator();
        Waitress waitress=new Waitress(iterator);
        waitress.printMenu();

        System.out.println();

        PancakeHouseMenu pancakeHouseMenu=new PancakeHouseMenu();
        iterator=pancakeHouseMenu.createIterator();
        waitress.setIterator(iterator);
        waitress.printMenu();

        //可以看出用迭代器模式就能遍历两种不同实现风格的集合
        //MenuItem{name='A&C', description='Pancake with scrambleb eggs,and toast', isVegetarian=true, price=12.99}
        //MenuItem{name='Regular', description='Pancake with fried eggs,and sausage', isVegetarian=false, price=12.99}
        //MenuItem{name='BlueBerrt', description='Pancake with blueberrt,and toast', isVegetarian=true, price=13.45}
        //MenuItem{name='Wffles', description='Pancake with your choice and toast', isVegetarian=true, price=13.59}
        //
        //MenuItem{name='K&B', description='Pancake with scrambleb eggs,and toast', isVegetarian=true, price=2.99}
        //MenuItem{name='Regular', description='Pancake with fried eggs,and sausage', isVegetarian=false, price=2.99}
        //MenuItem{name='BlueBerrt', description='Pancake with blueberrt,and toast', isVegetarian=true, price=3.45}
        //MenuItem{name='Wffles', description='Pancake with your choice and toast', isVegetarian=true, price=3.59}
    }
}