package abstractClasses;

import implementation.WarriorClothes;
import implementation.WarriorWeapon;

public class FactoryWarrior extends AbstractFactory {

    public Weapon createWeapon() {
        return new WarriorWeapon();
    }

    public Clothes createClothes() {
        return new WarriorClothes();
    }
}
