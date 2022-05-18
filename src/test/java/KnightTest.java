import org.junit.Before;
import org.junit.Test;
import player.Knight;
import weapons.Weapon;

import static org.junit.Assert.assertEquals;

public class KnightTest {

    Knight knight;

    @Before
    public void before(){
        knight = new Knight("Larry", 20, Weapon.SWORD);
    }

    @Test
    public void canReceiveReducedDamage(){
        knight.takeDamage(5);
        assertEquals(17, knight.getHealthPoints());
    }

    @Test
    public void cannotGetHealedByAttacks(){
        knight.takeDamage(1);
        assertEquals(20, knight.getHealthPoints());
    }
}
