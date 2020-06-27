package com.designpattern.observer;

public class SubscriberB implements Subscriber {

    public SubscriberB(Channel channel) {
    }
    
    public void update(String notification) {
        System.out.println("Subscriber B received notification : "+notification);
    }
}