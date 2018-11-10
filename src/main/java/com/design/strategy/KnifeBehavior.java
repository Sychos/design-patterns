package com.design.strategy;

/**
 * @Author:Madg
 * @Date:2018/11/10/010 21:37
 */
public class KnifeBehavior implements WeaponBehavior
{
    @Override
    public void useWeapon()
    {
        System.out.println("use knife to kill");
    }
}
