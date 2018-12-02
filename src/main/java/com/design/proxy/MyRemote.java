package com.design.proxy;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * @Author:Madg
 * @Date:2018/12/2/002 21:26
 */
public interface MyRemote extends Remote
{
    String sayHello() throws RemoteException;
}
