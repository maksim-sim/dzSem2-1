package characters;

public class Monk extends Character {
    private int meditation;
    private int agility;

    public Monk(int health, int strength, int meditation, int agility) {
        super(health, strength);
        this.meditation = meditation;
        this.agility = agility;
    }

    @Override
    public void attack() {
        System.out.println("Монах использует боевые искусства для нападения");
    }

    @Override
    public void heal() {
        System.out.println("Монах использует целебные травы");
    }
}