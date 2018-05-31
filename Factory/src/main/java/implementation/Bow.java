package implementation;

import interfaces.Weapon;

public class Bow implements Weapon {

    private static final int DAMAGE_BASE_BOW = 100;

    public int makeDamage(int amountBase) {
        System.out.println("The bow make a damage of " + DAMAGE_BASE_BOW * amountBase);
        return amountBase * DAMAGE_BASE_BOW;
    }
}
