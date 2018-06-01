package builders;

import enums.TypesDessert;
import enums.TypesDrink;
import enums.TypesMainDish;
import implementations.Dinner;

public class JunkDinner extends AbstractBuilder  {
    public void buildDrink() {
        dinner.setDrink(AbstractBuilder.DRINK_INSTANCE.getDrink(TypesDrink.COCACOLA));
    }

    public void buildDessert() {
        dinner.setDessert(AbstractBuilder.DESSERT_INSTANCE.getDessert(TypesDessert.ICECREAM));
    }

    public void buildMainDish() {
        dinner.setMainDish(AbstractBuilder.MAINDISH_INSTANCE.getMainDish(TypesMainDish.BURGER));
    }
}
