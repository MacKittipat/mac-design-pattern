package com.mackittipat.designpattern.behavioural.strategy;

import com.mackittipat.designpattern.behavioural.strategy.warrior.Archer;
import com.mackittipat.designpattern.behavioural.strategy.warrior.Knight;
import com.mackittipat.designpattern.behavioural.strategy.warrior.Warrior;
import com.mackittipat.designpattern.behavioural.strategy.weapon.Axe;
import org.junit.Test;

public class StrategyTest {

    @Test
    public void test() {
        Warrior knight = new Knight();
        knight.attack();

        Warrior archer = new Archer();
        archer.attack();

        knight.setWeapon(new Axe());
        knight.attack();
    }

}
