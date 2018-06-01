package builders;

import enums.TypesFactories;
import factories.AbstractFactory;
import implementations.Dinner;

public abstract class AbstractBuilder {

    protected static final AbstractFactory DRINK_INSTANCE = AbstractFactory.getFactoryInstance(TypesFactories.DRINK);
    protected static final AbstractFactory MAINDISH_INSTANCE = AbstractFactory.getFactoryInstance(TypesFactories.MAINDISH);
    protected static final AbstractFactory DESSERT_INSTANCE = AbstractFactory.getFactoryInstance(TypesFactories.DESSERT);

    protected Dinner dinner;

    public Dinner getDinner(){
        return dinner;
    }

    public void createDinner() {
        dinner = new Dinner();
    }

    public abstract void buildDrink();
    public abstract void buildDessert();
    public abstract void buildMainDish();
}
