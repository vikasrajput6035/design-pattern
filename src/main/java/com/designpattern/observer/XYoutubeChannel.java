package com.designpattern.observer;

import java.util.ArrayList;
import java.util.List;

public class XYoutubeChannel implements Channel {

    String video;
    List<Subscriber> subscribers = new ArrayList<Subscriber>();
    
    public void subscribe(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    public void unsubscribe(Subscriber subscriber) {
        if(subscribers.contains(subscriber)) {
            subscribers.remove(subscriber);
        }
    }

    public void notifySubscriber() {
        for(Subscriber subscriber: subscribers) {
            subscriber.update(video);
        }
    }

    public void uploadVideo(String video) {
        this.video = video;
        notifySubscriber();
    }
}
