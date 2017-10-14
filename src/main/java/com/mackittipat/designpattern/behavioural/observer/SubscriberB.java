package com.mackittipat.designpattern.behavioural.observer;

public class SubscriberB implements Observer {

    @Override
    public void update() {
        System.out.println("B get updated");
    }
}
