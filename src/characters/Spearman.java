package characters;

public class Spearman extends Character {
    private int weaponSkill;
    private int armor;

    public Spearman(int health, int strength, int weaponSkill, int armor) {
        super(health, strength);
        this.weaponSkill = weaponSkill;
        this.armor = armor;
    }

    @Override
    public void attack() {
        System.out.println("Копейщик наносит удар копьем");
    }

    @Override
    public void heal() {
        System.out.println("Копейщик лечит");
    }
}
