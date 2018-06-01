package implementations;

import builders.AbstractBuilder;

public class Waiter {
    AbstractBuilder abstractBuilder;

    public void setAbstractBuilder(AbstractBuilder abstractBuilder) {
        this.abstractBuilder = abstractBuilder;
    }

    public void createDinner() {
        System.out.println("Creating The Dinner !!");
        abstractBuilder.createDinner();
        abstractBuilder.buildDessert();
        abstractBuilder.buildDrink();
        abstractBuilder.buildMainDish();
    }

    public Dinner getDinner() {
        return abstractBuilder.getDinner();
    }

}
