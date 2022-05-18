package enemies;

import player.Player;

public class Orc extends Enemy{

    public Orc(int healthPoints) {
        super(healthPoints);
    }

    public void attack(Player target){
        target.takeDamage(3);
    }
}
