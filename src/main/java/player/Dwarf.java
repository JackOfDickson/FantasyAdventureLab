package player;

import com.sun.org.apache.xpath.internal.operations.Bool;
import weapons.Weapon;

public class Dwarf extends Fighter{

    public Dwarf(String name, int healthPoints, Weapon weapon) {
        super(name, healthPoints, weapon);
    }


    //overrides default
    public void takeDamage(int attack){
        double diceRoll = Math.random();
        if (diceRoll > 0.8){
            //attack misses
        } else {
            receiveDamage(attack);
        }
    }




}
