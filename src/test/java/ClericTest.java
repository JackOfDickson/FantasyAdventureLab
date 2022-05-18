import org.junit.Before;
import org.junit.Test;
import player.Barbarian;
import player.Cleric;
import weapons.Weapon;

import static org.junit.Assert.assertEquals;

public class ClericTest {

    Cleric cleric;
    Barbarian barbarian;

    @Before
    public void before(){
        cleric = new Cleric("Carlos", 12, 20);
        barbarian = new Barbarian("Bob", 20, Weapon.CLUB);
    }

    @Test
    public void canMend(){
        cleric.castMend(barbarian);
        assertEquals(24, barbarian.getHealthPoints());
        assertEquals(16, cleric.getMana());
    }

    @Test
    public void canCure(){
        cleric.castCure(barbarian);
        assertEquals(26, barbarian.getHealthPoints());
        assertEquals(12, cleric.getMana());
    }

}
