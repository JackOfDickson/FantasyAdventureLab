package enemies;

import moves.ITakeDamage;

public abstract class Enemy implements ITakeDamage {

    private int healthPoints;


    public Enemy(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void takeDamage(int attack){
        healthPoints -= attack;
    }

}
