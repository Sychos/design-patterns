package com.design.observer;

/**
 * @Author:Madg
 * @Date:2018/11/11/011 15:35
 */
public interface Subject
{
    void addObserver(Observer observer);
    void removeObjserver(Observer observer);

    void notifyObservers();
}
