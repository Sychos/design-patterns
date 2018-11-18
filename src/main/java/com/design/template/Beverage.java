package com.design.template;

/**
 * @Author:Madg
 * @Date:2018/11/18/018 19:09
 * 这是个饮料类，为了规范泡饮料（咖啡或者茶）的固定流程，具体不同的流程交给子类自己实现
 */
public abstract class Beverage
{
    public Beverage()
    {
        boilWater();
        brew();
        pourIncup();
        addCondiments();
    }

    //因为煮沸水的流程对于泡茶和泡咖啡都是固定的，所以直接在父类中实现，并且不让子类修改
    protected final void boilWater()
    {
        if (userCoolWater())
        {
            System.out.println("boil the water with cool water.");
        }
        else
        {
            System.out.println("boil the water with hot water.");
        }

    }

    //由于冲泡茶和咖啡的不一样，所以交给子类自己实现
    protected abstract void brew();

    //把饮料倒进杯子里，同上
    protected final void pourIncup()
    {
        System.out.println("Pour in cup.");
    }

    //添加作料不一样，交给子类自己实现
    protected abstract void addCondiments();

    //这是个钩子方法，是否用冰水烧开水，默认不用冰水
    protected boolean userCoolWater(){
        return false;
    }
}
