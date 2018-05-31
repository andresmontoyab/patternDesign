package implementation;

import interfaces.Weapon;

public class Axe implements Weapon {

    private static final int DAMAGE_BASE_AXE = 120;

    public int makeDamage(int amountBase) {
        System.out.println("The damage done by the axe is "+ amountBase * DAMAGE_BASE_AXE);
        return amountBase * DAMAGE_BASE_AXE;
    }
}
