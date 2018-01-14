package com.mackittipat.designpattern.behavioural.strategy.warrior;

import com.mackittipat.designpattern.behavioural.strategy.weapon.Weapon;

public abstract class Warrior {

    Weapon weapon;

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public void attack() {
        weapon.use();
    }

}
