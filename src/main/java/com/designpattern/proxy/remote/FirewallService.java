package com.designpattern.proxy.remote;

import java.net.URL;
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface FirewallService extends Remote{

    void accessWebsite(URL url) throws RemoteException;
}
