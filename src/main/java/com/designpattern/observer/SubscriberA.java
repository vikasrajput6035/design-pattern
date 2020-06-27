package com.designpattern.observer;

public class SubscriberA implements Subscriber {

    public SubscriberA(Channel channel) {
    }
    
    public void update(String notification) {
        System.out.println("Subscriber A received notification : "+notification);
    }
}