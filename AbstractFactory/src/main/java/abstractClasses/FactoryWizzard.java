package abstractClasses;

import implementation.WizzardClothes;
import implementation.WizzardWeapon;

public class FactoryWizzard extends AbstractFactory {

    public Weapon createWeapon() {
        return new WizzardWeapon();
    }

    public Clothes createClothes() {
        return new WizzardClothes();
    }
}
