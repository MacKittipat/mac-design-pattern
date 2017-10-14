package com.mackittipat.designpattern.behavioural.observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {

    private List<Observer> observerList = new ArrayList<>();

    public void registerObserver(Observer o) {
        observerList.add(o);
    }

    public void unregisterObserver(Observer o) {
        observerList.remove(o);
    }

    public void notifyObserver() {
        observerList.forEach(Observer::update);
    }

}
