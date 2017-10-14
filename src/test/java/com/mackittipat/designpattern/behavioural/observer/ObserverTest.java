package com.mackittipat.designpattern.behavioural.observer;

import org.junit.Test;

public class ObserverTest {

    @Test
    public void test() {
        Blog b = new Blog();

        b.registerObserver(new SubscriberA());
        b.registerObserver(new SubscriberB());

        b.notifyObserver();
    }
}