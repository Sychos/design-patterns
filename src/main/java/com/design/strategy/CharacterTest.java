package com.design.strategy;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @Author:Madg
 * @Date:2018/11/10/010 21:40
 */
public class CharacterTest
{
    @Test
    public void test()
    {
        //选择一个角色King
        Character character=new King();
        //选择一种武器Knife
        character.setWeaponBehavior(new KnifeBehavior());

        //使用
        character.performUserWeapon();

        //更换武器为Sword
        character.setWeaponBehavior(new SwordBehavior());
        //使用
        character.performUserWeapon();
    }


    //output:
    //use knife to kill
    //use sword to kill

}