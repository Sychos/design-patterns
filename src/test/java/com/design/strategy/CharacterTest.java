package com.design.strategy;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @Author:Madg
 * @Date:2018/11/10/010 21:56
 */
public class CharacterTest
{
    @Test
    public void test()
    {
        //1.选择一个角色King
        Character character=new King();
        //2.使用：默认匕首刺杀
        character.performUserWeapon();

        //3.更换武器为Sword
        character.setWeaponBehavior(new SwordBehavior());
        //4.使用
        character.performUserWeapon();
    }


    //output:
    //use knife to kill
    //use sword to kill
}