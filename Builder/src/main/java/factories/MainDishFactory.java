package factories;

import enums.TypesDessert;
import enums.TypesDrink;
import enums.TypesMainDish;
import implementations.Burger;
import implementations.Meat;
import implementations.VegBurger;
import interfaces.Dessert;
import interfaces.Drink;
import interfaces.MainDish;

public class MainDishFactory extends AbstractFactory {
    public Dessert getDessert(TypesDessert dessert) {
        return null;
    }

    public Drink getDrink(TypesDrink drink) {
        return null;
    }

    public MainDish getMainDish(TypesMainDish mainDish) {
        MainDish mainDishToReturn = null;

        switch (mainDish) {
            case BURGER:
                mainDishToReturn = new Burger();
                break;
            case VEGBURGER:
                mainDishToReturn = new VegBurger();
                break;
            case MEAT:
                mainDishToReturn = new Meat();
                break;
        }

        if (null == mainDishToReturn) {
            System.out.println("There's no dessert with this name " + mainDish);
        }
        return mainDishToReturn;

    }
}
