package com.designpattern.proxy.remote;

import java.net.URL;
import java.rmi.RemoteException;

public class FirewallServiceImpl implements FirewallService {

    String[] blockedSites = {"facebook","gmail","youtube"};
    
    public FirewallServiceImpl() throws RemoteException{
        super();
    }
    
    public void accessWebsite(URL url) throws RemoteException{
        
        boolean isSiteBlocked = false;
        for(String site:blockedSites) {
            if(url.getHost().contains(site)) {
                isSiteBlocked = true;
            }
        }
        
        if(isSiteBlocked) {
            System.out.println("Access Denied!!");
        }else {
            System.out.println(url.getHost()+" site is opening...");
        }
    }
    
}
