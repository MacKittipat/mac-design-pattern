package com.mackittipat.designpattern.factory;

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
