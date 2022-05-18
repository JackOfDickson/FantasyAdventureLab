package player;

import moves.ITakeDamage;
import weapons.Item;

import java.util.HashMap;

public abstract class Player implements ITakeDamage {

    private String name;
    private int healthPoints;
    private HashMap<Item, Integer> backpack;

    public Player(String name, int healthPoints) {
        this.name = name;
        this.healthPoints = healthPoints;
        this.backpack = new HashMap<>();
    }

    public String getName() {
        return name;
    }

    public HashMap<Item, Integer> getBackpack() {
        return backpack;
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

    //using new method of hashmap
    public void addItem(Item item){
        backpack.putIfAbsent(item, 0);
        backpack.put(item, backpack.get(item)+1);
    }

    public void useHealthPotion(){
        if (backpack.containsKey(Item.HealthPotion)){
            backpack.put(Item.HealthPotion, backpack.get(Item.HealthPotion) - 1);
            receiveHealing(5);
            if (backpack.get(Item.HealthPotion) == 0);
            backpack.remove(Item.HealthPotion);
        }
    }


}
