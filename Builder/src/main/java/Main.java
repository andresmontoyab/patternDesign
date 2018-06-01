import builders.HealthDinner;
import builders.JunkDinner;
import builders.VegDinner;
import implementations.Waiter;

public class Main {
    public static void main(String[] args) {
        Waiter waiter = new Waiter();
        waiter.setAbstractBuilder(new JunkDinner());
        waiter.createDinner();

        System.out.println("Creating another Dinner");
        waiter.setAbstractBuilder(new VegDinner());
        waiter.createDinner();

        System.out.println("Creating another Dinner");
        waiter.setAbstractBuilder(new HealthDinner());
        waiter.createDinner();
    }
}
