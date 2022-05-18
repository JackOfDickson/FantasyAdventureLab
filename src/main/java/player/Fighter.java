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

    public Weapon getWeapon() {
        return weapon;
    }

    public void weaponAttack(Enemy target){
        target.takeDamage(weapon.getAttackValue());
    }
    public void swapWeapon(Weapon newWeapon){
        this.weapon = newWeapon;
    }
}
