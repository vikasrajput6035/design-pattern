package com.designpattern.proxy.remote;

import java.net.MalformedURLException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class RemoteProxyPatternDemo {

    public static void main(String[] args) throws RemoteException, MalformedURLException, NotBoundException {
        
        //Start Remote Firewall
        RemoteProxyPatternDemo app = new RemoteProxyPatternDemo();
        app.startUpServer();
        
        //Start Firewall Client
        FirewallClient client = new FirewallClient();
        client.accessWebsite("http://www.facebook.com");
        client.accessWebsite("https://www.google.com");
        client.accessWebsite("http://www.gmail.com");
        client.accessWebsite("https://www.company.com");
    }
    
    void startUpServer() throws RemoteException{
        //Here UnicastRemoteObject.exportObject returns the proxy object for Remote FirewallServiceImpl class.
        FirewallService firewallProxyObj = (FirewallService)UnicastRemoteObject.exportObject(new FirewallServiceImpl(), 0);
        Registry registry = LocateRegistry.createRegistry(1099);
        registry.rebind("firewall", firewallProxyObj);
    }
}
