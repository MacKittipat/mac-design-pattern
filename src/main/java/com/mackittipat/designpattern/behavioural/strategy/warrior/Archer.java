package com.mackittipat.designpattern.behavioural.strategy.warrior;

import com.mackittipat.designpattern.behavioural.strategy.weapon.Bow;

public class Archer extends Warrior {

    public Archer() {
        weapon = new Bow();
    }
}
