package implementation;

import interfaces.Weapon;

public class WeaponFactory {

    private static final Weapon INSTANCE_BOW = new Bow();
    private static final Weapon INSTANCE_ROD = new Rod();
    private static final Weapon INSTANCE_AXE = new Axe();

    public static Weapon getInstance(WeaponTypes weapon) {

        Weapon weaponInstance = null;

        switch (weapon) {
            case BOW:
                weaponInstance = INSTANCE_BOW;
                break;
            case AXE:
                weaponInstance = INSTANCE_AXE;
                break;
            case ROD:
                weaponInstance = INSTANCE_ROD;
                break;
            }

            if (null == weaponInstance) {
                System.out.println("We doesnt found a instance of the type " + weapon.toString());
            }
            return weaponInstance;

    }
}
