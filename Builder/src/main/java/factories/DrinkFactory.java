package factories;

import enums.TypesDessert;
import enums.TypesDrink;
import enums.TypesMainDish;
import implementations.CocaCola;
import implementations.Juice;
import implementations.Water;
import interfaces.Dessert;
import interfaces.Drink;
import interfaces.MainDish;

public class DrinkFactory extends AbstractFactory {

    public Dessert getDessert(TypesDessert dessert) {
        return null;
    }

    public Drink getDrink(TypesDrink drink) {
        Drink drinkToReturn = null;

        switch (drink) {
            case COCACOLA:
                drinkToReturn = new CocaCola();
                break;
            case WATER:
                drinkToReturn = new Water();
                break;
            case JUICE:
                drinkToReturn = new Juice();
                break;
        }

        if (null == drinkToReturn) {
            System.out.println("There's no dessert with this name " + drink);
        }
        return drinkToReturn;
    }

    public MainDish getMainDish(TypesMainDish mainDish) {
        return null;
    }
}
