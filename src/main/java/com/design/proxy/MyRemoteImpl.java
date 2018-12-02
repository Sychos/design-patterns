package com.design.proxy;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * @Author:Madg
 * @Date:2018/12/2/002 21:28
 */
public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote
{
    public MyRemoteImpl() throws RemoteException
    {
    }

    @Override
    public String sayHello() throws RemoteException
    {
        return "Hello, I'm Remote server";
    }

    public static void main(String[] args)
    {
        try
        {
            MyRemote service = new MyRemoteImpl();
            Naming.rebind("remoteService",service);
        }
        catch (RemoteException e)
        {
            e.printStackTrace();
        }
        catch (MalformedURLException e)
        {
            e.printStackTrace();
        }
    }
}
