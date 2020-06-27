package com.designpattern.observer;

public class SubscriberC implements Subscriber {

    public SubscriberC(Channel channel) {
    }
    
    public void update(String notification) {
        System.out.println("Subscriber C received notification : "+notification);
    }
}