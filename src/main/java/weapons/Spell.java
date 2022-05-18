package weapons;

public enum Spell {
    FIREBALL(5,2),
    LIGHTNINGBLAST(8,4);

    private int damage;
    private int manaCost;

    Spell(int damage, int manaCost) {
        this.damage = damage;
        this.manaCost = manaCost;
    }

    public int getDamage() {
        return damage;
    }

    public int getManaCost() {
        return manaCost;
    }
}
