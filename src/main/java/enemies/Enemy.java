package enemies;

import moves.ITakeDamage;

public abstract class Enemy implements ITakeDamage {

    private int healthPoints;
    private int strength;

    public Enemy(int healthPoints, int strength) {
        this.healthPoints = healthPoints;
        this.strength = strength;
    }

    public void takeDamage(int attack){
        healthPoints -= attack;
    }

}
