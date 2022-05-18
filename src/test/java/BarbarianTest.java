import enemies.Orc;
import org.junit.Before;
import org.junit.Test;
import player.Barbarian;
import weapons.Weapon;

import static org.junit.Assert.assertEquals;

public class BarbarianTest {

    private Barbarian barbarian;
    private Orc orc;

    @Before
    public void before(){
        barbarian = new Barbarian("Bob", 20, Weapon.CLUB);
        orc = new Orc(10);
    }

    @Test
    public void canTakeDamage(){
        barbarian.takeDamage(5);
        assertEquals(15, barbarian.getHealthPoints());
    }

    @Test
    public void canAttackTarget(){
        barbarian.weaponAttack(orc);
        assertEquals(4, orc.getHealthPoints());
    }
}
