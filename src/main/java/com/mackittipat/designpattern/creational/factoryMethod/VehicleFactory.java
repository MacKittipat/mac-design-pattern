package com.mackittipat.designpattern.creational.factoryMethod;

public class VehicleFactory {

    public static Vehicle getVehicle(String type) {
        if("car".equalsIgnoreCase(type)) {
            return new Car();
        } else if("bus".equalsIgnoreCase(type)) {
            return new Bus();
        } else if("motorcycle".equalsIgnoreCase(type)) {
            return new Motorcycle();
        }
        return null;
    }
}
