package com.designpattern.proxy.remote;

import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class FirewallClient {
    
    private FirewallService firewall;
    
    public FirewallClient() throws RemoteException, NotBoundException {
        Registry registry = LocateRegistry.getRegistry();
        FirewallService firewall = (FirewallService) registry.lookup("firewall");
        this.firewall = firewall;
    }
    
    void accessWebsite(String url) throws MalformedURLException, RemoteException {
        URL siteUrl = new URL(url);
        firewall.accessWebsite(siteUrl);
    }
}
