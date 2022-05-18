package player;

import enemies.Enemy;
import moves.IWeapon;
import weapons.Weapon;

public abstract class Fighter extends Player implements IWeapon {

    private Weapon weapon;

    public Fighter(String name, int healthPoints, Weapon weapon) {
        super(name, healthPoints);
        this.weapon = weapon;
    }

    public void weaponAttack(Enemy target){
        target.takeDamage(weapon.getDamage());
    }
}
