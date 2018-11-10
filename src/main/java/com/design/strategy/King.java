package com.design.strategy;

/**
 * @Author:Madg
 * @Date:2018/11/10/010 21:34
 */
public class King extends Character
{
    //国王默认用匕首刺杀
    public King()
    {
        weaponBehavior=new KnifeBehavior();
    }
    @Override
    void fight()
    {
        System.out.println("King fight");
    }


}
