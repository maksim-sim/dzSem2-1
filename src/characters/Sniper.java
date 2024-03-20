package characters;

public class Sniper extends Character {
    private int precision;
    private int camouflage;

    public Sniper(int health, int strength, int precision, int camouflage) {
        super(health, strength);
        this.precision = precision;
        this.camouflage = camouflage;
    }

    @Override
    public void attack() {
        System.out.println("Снайпер стреляет из винтовки");
    }

    @Override
    public void heal() {
        System.out.println("Снайпер применяет аптечку");
    }
}
