import characters.*;

import java.lang.Character;

public class Main {
    public static void main(String[] args) {
        Peasant peasant = new Peasant(100, 10, 5, 3);
        Bandit bandit = new Bandit(80, 15, 8, 6);
        Sniper sniper = new Sniper(90, 20, 12, 10);
        Warlock warlock = new Warlock(70, 25, 15, 20);
        Spearman spearman = new Spearman(120, 18, 10, 8);
        Crossbowman crossbowman = new Crossbowman(85, 16, 13, 12);
        Monk monk = new Monk(95, 14, 12, 9);

        System.out.println(peasant);
        System.out.println(bandit);
        System.out.println(sniper);
        System.out.println(warlock);
        System.out.println(spearman);
        System.out.println(crossbowman);
        System.out.println(monk);
    }
}
