package com.design.proxy;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

/**
 * @Author:Madg
 * @Date:2018/12/2/002 21:32
 */
public class RemoteClient
{
    public static void main(String[] args)
    {
        new RemoteClient().go();
    }

    private void go()
    {
        try
        {
            MyRemote remoteService= (MyRemote) Naming.lookup("rmi://127.0.0.1/remoteService");

            System.out.println(remoteService.sayHello());
        }
        catch (NotBoundException e)
        {
            e.printStackTrace();
        }
        catch (MalformedURLException e)
        {
            e.printStackTrace();
        }
        catch (RemoteException e)
        {
            e.printStackTrace();
        }
    }
}
