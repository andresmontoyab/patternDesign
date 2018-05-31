package AbstractFactoryCharacters;

import AbstractFactoryCharacters.abstractClasses.AbstractFactory;
import AbstractFactoryCharacters.abstractClasses.Character;

public class Main {

    public static void main(String[] args) {
        System.out.println("Calling Warrior Factory");

        AbstractFactory factoryWarrior = AbstractFactory.getInstance(Character.WARRIOR);
        factoryWarrior.createClothes();
        factoryWarrior.createWeapon();

        System.out.println("Calling Wizzard Factory");

        AbstractFactory factoryWizzard = AbstractFactory.getInstance(Character.WIZZARD);
        factoryWizzard.createClothes();
        factoryWizzard.createWeapon();

        System.out.println("Calling Hunter Factory");
        AbstractFactory factoryHunter= AbstractFactory.getInstance(Character.HUNTER);
        factoryHunter.createClothes();
        factoryHunter.createWeapon();

        System.out.println("Calling Other Factory");
        AbstractFactory otherFactory= AbstractFactory.getInstance(Character.OTHER);
        otherFactory.createClothes();
        otherFactory.createWeapon();
    }
}
