package player;

import weapons.Weapon;

public class Knight extends Fighter{

    private int armour;

    public Knight(String name, int healthPoints, Weapon weapon) {
        super(name, healthPoints, weapon);
        this.armour = 2;
    }

    public void takeDamage(int attack){
        int modifiedAttack = attack - 2;
        if (modifiedAttack <= 0){
            //nothing happens, no damage
        } else {
            receiveDamage(modifiedAttack);
        }

    }
}
