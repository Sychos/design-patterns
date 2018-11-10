package com.design.strategy;

/**
 * @Author:Madg
 * @Date:2018/11/10/010 21:29
 */
public abstract class Character
{
    WeaponBehavior weaponBehavior;

    public void setWeaponBehavior(WeaponBehavior weaponBehavior)
    {
        this.weaponBehavior = weaponBehavior;
    }

    abstract void fight();

    public final void performUserWeapon()
    {
        fight();
        weaponBehavior.useWeapon();
    }
}
