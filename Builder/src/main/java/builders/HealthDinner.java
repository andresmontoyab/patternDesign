package builders;

import enums.TypesDessert;
import enums.TypesDrink;
import enums.TypesMainDish;

public class HealthDinner extends AbstractBuilder {

    public void buildDrink() {
        dinner.setDrink(AbstractBuilder.DRINK_INSTANCE.getDrink(TypesDrink.WATER));
    }

    public void buildDessert() {
        dinner.setDessert(AbstractBuilder.DESSERT_INSTANCE.getDessert(TypesDessert.CAKE));
    }

    public void buildMainDish() {
        dinner.setMainDish(AbstractBuilder.MAINDISH_INSTANCE.getMainDish(TypesMainDish.MEAT));
    }
}
