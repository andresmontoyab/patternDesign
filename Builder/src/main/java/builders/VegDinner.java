package builders;

import enums.TypesDessert;
import enums.TypesDrink;
import enums.TypesMainDish;

public class VegDinner extends AbstractBuilder  {
    public void buildDrink() {
        dinner.setDrink(AbstractBuilder.DRINK_INSTANCE.getDrink(TypesDrink.JUICE));
    }

    public void buildDessert() {
        dinner.setDessert(AbstractBuilder.DESSERT_INSTANCE.getDessert(TypesDessert.SALAD));
    }

    public void buildMainDish() {
        dinner.setMainDish(AbstractBuilder.MAINDISH_INSTANCE.getMainDish(TypesMainDish.VEGBURGER));
    }
}
