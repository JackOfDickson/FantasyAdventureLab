import org.junit.Before;
import org.junit.Test;
import player.Barbarian;
import weapons.Weapon;

import static org.junit.Assert.assertEquals;

public class BarbarianTest {

    private Barbarian barbarian;

    @Before
    public void before(){
        barbarian = new Barbarian("Bob", 20, Weapon.CLUB);
    }

    @Test
    public void canTakeDamage(){
        barbarian.takeDamage(5);
        assertEquals(15, barbarian.getHealthPoints());
    }
}
