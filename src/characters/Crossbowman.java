package characters;

public class Crossbowman extends Character {
    private int accuracy;
    private int reloadSpeed;

    public Crossbowman(int health, int strength, int accuracy, int reloadSpeed) {
        super(health, strength);
        this.accuracy = accuracy;
        this.reloadSpeed = reloadSpeed;
    }

    @Override
    public void attack() {
        System.out.println("Арбалетчик стреляет из арбалета");
    }

    @Override
    public void heal() {
        System.out.println("Арбалетчик оказывает первую помощьt");
    }
}
