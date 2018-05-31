package AbstractFactoryCharacters.abstractClasses;

import AbstractFactoryCharacters.implementation.HunterClothes;
import AbstractFactoryCharacters.implementation.HunterWeapon;

public class FactoryHunter extends AbstractFactory {


    public Weapon createWeapon() {
        return new HunterWeapon();
    }

    public Clothes createClothes() {
        return new HunterClothes();
    }
}
