package weapons;

public enum Heal {

    MEND(4, 4),
    CURE(6, 8);

    private int healValue;
    private int manaCost;

    Heal(int healValue, int manaCost) {
        this.healValue = healValue;
        this.manaCost = manaCost;
    }

    public int getHealValue() {
        return healValue;
    }

    public int getManaCost() {
        return manaCost;
    }
}
