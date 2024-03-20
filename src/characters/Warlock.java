package characters;

public class Warlock extends Character {
    private int spellPower;
    private int mana;

    public Warlock(int health, int strength, int spellPower, int mana) {
        super(health, strength);
        this.spellPower = spellPower;
        this.mana = mana;
    }

    @Override
    public void attack() {
        System.out.println("Колдун произносит заклинание");
    }

    @Override
    public void heal() {
        System.out.println("Колдун использует магию для лечения ран");
    }
}
