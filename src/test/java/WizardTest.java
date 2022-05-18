import enemies.Orc;
import org.junit.Before;
import org.junit.Test;
import player.Wizard;

import static org.junit.Assert.assertEquals;

public class WizardTest {

    Wizard wizard;
    Orc orc;

    @Before
    public void before(){
        wizard = new Wizard("Barry", 10, 20);
        orc = new Orc(10);
    }

    @Test
    public void canCastFireball(){
        wizard.castFireball(orc);
        assertEquals(5,orc.getHealthPoints());
        assertEquals(18, wizard.getMana());
    }

    @Test
    public void canCastLightningBlast(){
        wizard.castLightningBlast(orc);
        assertEquals(2,orc.getHealthPoints());
        assertEquals(16, wizard.getMana());
    }
}
