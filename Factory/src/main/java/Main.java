import implementation.WeaponFactory;
import implementation.WeaponTypes;
import interfaces.Weapon;

public class Main {

    public static void main(String[] args) {

        System.out.println("Creating a Rod");
        Weapon rod = WeaponFactory.getInstance(WeaponTypes.ROD);
        rod.makeDamage(200);

        System.out.println("Creating a Bow");
        Weapon bow = WeaponFactory.getInstance(WeaponTypes.BOW);
        bow.makeDamage(200);

        System.out.println("Creating a Axe");
        Weapon axe = WeaponFactory.getInstance(WeaponTypes.AXE);
        axe.makeDamage(200);
    }
}
