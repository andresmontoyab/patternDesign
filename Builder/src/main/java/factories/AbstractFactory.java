package factories;

import enums.TypesDessert;
import enums.TypesDrink;
import enums.TypesFactories;
import enums.TypesMainDish;
import interfaces.Dessert;
import interfaces.Drink;
import interfaces.MainDish;

public abstract class AbstractFactory {

    private static final AbstractFactory DESSERT_INSTANCE = new DessertFactory();
    private static final AbstractFactory DRINK_INSTANCE = new DrinkFactory();
    private static final AbstractFactory MAINDISH_INSTANCE = new MainDishFactory();

    public static AbstractFactory getFactoryInstance(TypesFactories factory) {
        AbstractFactory instanceToReturn = null;

        switch (factory) {
            case DESSERT:
                instanceToReturn = DESSERT_INSTANCE;
                break;
            case DRINK:
                instanceToReturn = DRINK_INSTANCE;
                break;
            case MAINDISH:
                instanceToReturn = MAINDISH_INSTANCE;
                break;
        }

        if (null == instanceToReturn) {
            System.out.println("There's no instance with the name "+ factory);
        }
        return instanceToReturn;
    }

    public abstract Dessert getDessert(TypesDessert dessert);
    public abstract Drink getDrink(TypesDrink drink);
    public abstract MainDish getMainDish(TypesMainDish mainDish);
}
