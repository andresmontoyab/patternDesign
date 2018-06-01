package implementations;

import interfaces.Dessert;
import interfaces.Drink;
import interfaces.MainDish;

public class Dinner {

    private Drink drink;
    private Dessert dessert;
    private MainDish mainDish;

    public Drink getDrink() {
        return drink;
    }

    public void setDrink(Drink drink) {
        this.drink = drink;
    }

    public Dessert getDessert() {
        return dessert;
    }

    public void setDessert(Dessert dessert) {
        this.dessert = dessert;
    }

    public MainDish getMainDish() {
        return mainDish;
    }

    public void setMainDish(MainDish mainDish) {
        this.mainDish = mainDish;
    }
}
