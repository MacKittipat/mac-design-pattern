package com.mackittipat.designpattern.structural.decorator;

public class Sword extends WeaponDecorator {

    private Warrior warrior;

    public Sword(Warrior warrior) {
        this.warrior = warrior;
    }

    public void attack() {
        System.out.println("Attack by Sword");
    }
}
