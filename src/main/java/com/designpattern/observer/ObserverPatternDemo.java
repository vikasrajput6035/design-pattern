package com.designpattern.observer;

public class ObserverPatternDemo {

    public static void main(String[] args) {
        
        XYoutubeChannel youtubeChannel = new XYoutubeChannel();
        SubscriberA subscriberA = new SubscriberA(youtubeChannel);
        SubscriberB subscriberB = new SubscriberB(youtubeChannel);
        SubscriberC subscriberC = new SubscriberC(youtubeChannel);
        
        youtubeChannel.subscribe(subscriberA);
        youtubeChannel.subscribe(subscriberB);
        
        youtubeChannel.uploadVideo("Birds Dancing Video Uploaded !!!! ");
        
        youtubeChannel.subscribe(subscriberC);
        youtubeChannel.uploadVideo("Birds Dancing Video Part 2 Uploaded !!!! ");
        
        youtubeChannel.unsubscribe(subscriberA);
        youtubeChannel.uploadVideo("Birds Dancing Video Part 3 Uploaded !!!! ");
    }

}
