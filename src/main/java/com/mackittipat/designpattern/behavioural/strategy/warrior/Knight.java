package com.mackittipat.designpattern.behavioural.strategy.warrior;

import com.mackittipat.designpattern.behavioural.strategy.weapon.Sword;

public class Knight extends Warrior {

    public Knight() {
        weapon = new Sword();
    }
}
