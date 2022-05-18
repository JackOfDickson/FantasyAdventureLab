package player;


import weapons.Heal;
import weapons.Spell;

import java.util.ArrayList;
import java.util.Arrays;

public class Cleric extends Mage{

    private ArrayList<Heal> spells;

    public Cleric(String name, int healthPoints, int mana) {
        super(name, healthPoints, mana);
        this.spells = new ArrayList<>(Arrays.asList(Heal.MEND, Heal.CURE));
    }

    public ArrayList<Heal> getSpells() {
        return spells;
    }

    public void castMend(Player target){
        useMana(spells.get(0).getManaCost());
        target.receiveHealing(spells.get(0).getHealValue());
    }

    public void castCure(Player target){
        useMana(spells.get(1).getManaCost());
        target.receiveHealing(spells.get(1).getHealValue());
    }
}
