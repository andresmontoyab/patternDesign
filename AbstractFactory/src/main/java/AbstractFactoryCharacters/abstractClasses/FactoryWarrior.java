package AbstractFactoryCharacters.abstractClasses;

import AbstractFactoryCharacters.implementation.WarriorClothes;
import AbstractFactoryCharacters.implementation.WarriorWeapon;

public class FactoryWarrior extends AbstractFactory {

    public Weapon createWeapon() {
        return new WarriorWeapon();
    }

    public Clothes createClothes() {
        return new WarriorClothes();
    }
}
