package player;

import enemies.Enemy;
import weapons.Weapon;

public class Barbarian extends Fighter{

    private int attackModifier;

    public Barbarian(String name, int healthPoints, Weapon weapon) {
        super(name, healthPoints, weapon);
        this.attackModifier = 2;
    }

    public void weaponAttack(Enemy target){
        target.takeDamage(getWeapon().getAttackValue() + attackModifier);
    }

}
