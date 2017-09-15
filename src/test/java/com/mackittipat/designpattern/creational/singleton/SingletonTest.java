package com.mackittipat.designpattern.creational.singleton;

import org.junit.Test;

public class SingletonTest {

    @Test
    public void test() {
        Configuration configuration = Configuration.getInstance();
        System.out.println("Hash code = " + configuration.hashCode());

        configuration = Configuration.getInstance();
        System.out.println("Hash code = " + configuration.hashCode());
    }
}