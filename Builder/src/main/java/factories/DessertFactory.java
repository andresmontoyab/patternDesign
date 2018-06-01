package factories;

import enums.TypesDessert;
import enums.TypesDrink;
import enums.TypesMainDish;
import implementations.Cake;
import implementations.IceCream;
import implementations.Salad;
import interfaces.Dessert;
import interfaces.Drink;
import interfaces.MainDish;

public class DessertFactory extends AbstractFactory {

    public Dessert getDessert(TypesDessert dessert) {
        Dessert dessertToReturn = null;

        switch (dessert) {
            case CAKE:
                dessertToReturn = new Cake();
                break;
            case SALAD:
                dessertToReturn = new Salad();
                break;
            case ICECREAM:
                dessertToReturn = new IceCream();
                break;
        }

        if (null == dessertToReturn) {
            System.out.println("There's no dessert with this name " + dessert);
        }
        return dessertToReturn;
    }

    public Drink getDrink(TypesDrink drink) {
        return null;
    }

    public MainDish getMainDish(TypesMainDish mainDish) {
        return null;
    }
}
