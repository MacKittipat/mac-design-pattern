package com.mackittipat.designpattern.behavioural.observer;

public class SubscriberA implements Observer {

    @Override
    public void update() {
        System.out.println("A get updated");
    }
}
