package com.mackittipat.designpattern.creational.singleton;

public class Configuration {

    private static Configuration instant;

    private Configuration() {
    }

    public static Configuration getInstance() {
        if(instant == null) {
            System.out.println("Creating new instant");
            instant = new Configuration();
        }
        return instant;
    }
}
