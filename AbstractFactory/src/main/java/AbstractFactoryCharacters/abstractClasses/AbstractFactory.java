package AbstractFactoryCharacters.abstractClasses;

public abstract class AbstractFactory {

    private static final AbstractFactory WARRIOR_INSTANCE = new FactoryWarrior();
    private static final AbstractFactory WIZZAR_INSTANCE = new FactoryWizzard();
    private static final AbstractFactory HUNTER_INSTANCE = new FactoryHunter();

    public static AbstractFactory getInstance(Character typeObject) {
        // return one of the posible objects.
        AbstractFactory objectToReturn = null;
        switch (typeObject) {
            case WARRIOR:
                objectToReturn = WARRIOR_INSTANCE;
                break;
            case WIZZARD:
                objectToReturn = WIZZAR_INSTANCE;
                break;
            case HUNTER:
                objectToReturn = HUNTER_INSTANCE;
                break;
        }

        if (null == objectToReturn) {
            System.out.println("We cant create a any Factory class ");
        }
        return objectToReturn;
    }

    public abstract Weapon createWeapon();

    public abstract Clothes createClothes();

}
