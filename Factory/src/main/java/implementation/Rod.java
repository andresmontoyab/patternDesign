package implementation;

import interfaces.Weapon;

public class Rod implements Weapon {

    private static final int DAMAGE_BASE_ROD = 150;

    public int makeDamage(int amountBase) {
        System.out.println("The damage done by the rod is "+ amountBase * DAMAGE_BASE_ROD);
        return amountBase * DAMAGE_BASE_ROD;
    }
}
