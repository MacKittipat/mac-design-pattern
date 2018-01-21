package com.mackittipat.designpattern.structural.decorator;

import org.junit.Test;

public class DecoratorTest {

    @Test
    public void test() {
        Warrior warrior = new Knight();
        warrior.attack();
        warrior = new Sword(warrior);
        warrior.attack();
    }
}