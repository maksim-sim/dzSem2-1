package characters;

public class Peasant extends Character {
    private int farmingSkill;
    private int cookingSkill;

    public Peasant(int health, int strength, int farmingSkill, int cookingSkill) {
        super(health, strength);
        this.farmingSkill = farmingSkill;
        this.cookingSkill = cookingSkill;
    }

    @Override
    public void attack() {
        System.out.println("Крестьянин атакует вилами.");
    }

    @Override
    public void heal() {
        System.out.println("Крестьянин лечит.");
    }
}
