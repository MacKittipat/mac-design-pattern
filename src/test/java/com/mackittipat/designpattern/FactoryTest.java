package com.mackittipat.designpattern;

import com.mackittipat.designpattern.factory.Vehicle;
import com.mackittipat.designpattern.factory.VehicleFactory;
import org.junit.Assert;
import org.junit.Test;

public class FactoryTest {

    @Test
    public void test() {
        Vehicle vehicle = VehicleFactory.getVehicle("car");
        Assert.assertEquals("Car beep", vehicle.beep());

        vehicle = VehicleFactory.getVehicle("bus");
        Assert.assertEquals("Bus beep", vehicle.beep());

        vehicle = VehicleFactory.getVehicle("motorcycle");
        Assert.assertEquals("Motorcycle beep", vehicle.beep());
    }
}
