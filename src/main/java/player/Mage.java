package player;

public abstract class Mage extends Player {
    private int mana;

    public Mage(String name, int healthPoints, int mana) {
        super(name, healthPoints);
        this.mana = mana;
    }

    public int getMana() {
        return mana;
    }

    public void useMana(int cost){
        mana -= cost;
    }
}
