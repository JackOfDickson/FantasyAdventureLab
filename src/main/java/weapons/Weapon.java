package weapons;

public enum Weapon {
    CLUB(4),
    AXE(5),
    SWORD(6);

    private int attackValue;

    Weapon(int attackValue) {
        this.attackValue = attackValue;
    }

    public int getAttackValue() {
        return attackValue;
    }
}
