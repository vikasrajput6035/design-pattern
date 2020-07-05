package com.designpattern.proxy.virtual;

public class VirtualProxyPatternDemo {

    public static void main(String[] args) throws InterruptedException {
        User user = new ProxyUser("123");
        System.out.println("User Name : "+user.getName());
        System.out.println("User Email : "+user.getEmail());
        System.out.println("User Contact : "+user.getContact());
        Thread.sleep(3000);
        System.out.println("User Name : "+user.getName());
        System.out.println("User Email : "+user.getEmail());
        System.out.println("User Contact : "+user.getContact());
    }

}
