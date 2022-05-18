package player;

import enemies.Enemy;
import weapons.Spell;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;


public class Wizard extends Mage{

    private ArrayList<Spell> spells;
//    private HashMap<String, Spell> spells;

    public Wizard(String name, int healthPoints, int mana) {
        super(name, healthPoints, mana);
//        this.spells = new HashMap<>();
        this.spells = new ArrayList<>(Arrays.asList(Spell.FIREBALL, Spell.LIGHTNINGBLAST));
    }

    public void castFireball(Enemy target){
        useMana(spells.get(0).getManaCost());
        target.takeDamage(spells.get(0).getDamage());
    }

    public void castLightningBlast(Enemy target){
        useMana(spells.get(1).getManaCost());
        target.takeDamage(spells.get(1).getDamage());
    }


}
