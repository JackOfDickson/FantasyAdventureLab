package player;

import moves.ITakeDamage;

public abstract class Player implements ITakeDamage {

    private String name;
    private int healthPoints;

    public Player(String name, int healthPoints) {
        this.name = name;
        this.healthPoints = healthPoints;
    }

    public String getName() {
        return name;
    }

    public int getHealthPoints() {
        return this.healthPoints;
    }

    public void receiveHealing(int healAmount){
        healthPoints += healAmount;
    }

    public void takeDamage(int attack){
        healthPoints -= attack;
    }
    // in the event takeDamage is overriden use this to affect healthPoints
    public void receiveDamage(int attack) {
        healthPoints -= attack;
    }
}
