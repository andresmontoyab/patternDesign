package abstractClasses;

import implementation.HunterClothes;
import implementation.HunterWeapon;

public class FactoryHunter extends AbstractFactory {


    public Weapon createWeapon() {
        return new HunterWeapon();
    }

    public Clothes createClothes() {
        return new HunterClothes();
    }
}
