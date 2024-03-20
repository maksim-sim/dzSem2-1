package characters;

public abstract class Character {
    protected int health;
    protected int strength;

    public Character(int health, int strength) {
        this.health = health;
        this.strength = strength;
    }

    public abstract void attack();

    public abstract void heal();

    @Override
    public String toString() {
        return getClass().getSimpleName();
    }
}