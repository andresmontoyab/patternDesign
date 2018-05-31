package AbstractFactoryCharacters.abstractClasses;

import AbstractFactoryCharacters.implementation.WizzardClothes;
import AbstractFactoryCharacters.implementation.WizzardWeapon;

public class FactoryWizzard extends AbstractFactory {

    public Weapon createWeapon() {
        return new WizzardWeapon();
    }

    public Clothes createClothes() {
        return new WizzardClothes();
    }
}
