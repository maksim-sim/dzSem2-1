package characters;

public class Bandit extends Character {
    private int stealth;
    private int agility;

    public Bandit(int health, int strength, int stealth, int agility) {
        super(health, strength);
        this.stealth = stealth;
        this.agility = agility;
    }

    @Override
    public void attack() {
        System.out.println("Разбойник атакует мечём.");
    }

    @Override
    public void heal() {
        System.out.println("Разбойник лечит.");
    }
}
