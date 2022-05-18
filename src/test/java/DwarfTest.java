import org.junit.Before;
import org.junit.Test;
import player.Dwarf;
import weapons.Weapon;

import static org.junit.Assert.assertEquals;

public class DwarfTest {

    Dwarf dwarf;

    @Before
    public void before(){
        dwarf = new Dwarf("Sleepy", 20, Weapon.AXE);
    }

//    @Test //this test will depend on the 20% chance for the dwarf to dodge the attack
//    public void canDodgeIncomingAttacks(){
//        dwarf.takeDamage(5);
//        assertEquals(20, dwarf.getHealthPoints());
//    }
}
