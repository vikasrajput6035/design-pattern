package com.designpattern.observer;

public interface Channel {

    void subscribe(Subscriber subscriber);
    void unsubscribe(Subscriber subscriber);
    void notifySubscriber();
}
