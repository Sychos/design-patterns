package com.design.strategy;

/**
 * @Author:Madg
 * @Date:2018/11/10/010 21:38
 */
public class SwordBehavior implements WeaponBehavior
{
    @Override
    public void useWeapon()
    {
        System.out.println("use sword to kill");
    }
}
