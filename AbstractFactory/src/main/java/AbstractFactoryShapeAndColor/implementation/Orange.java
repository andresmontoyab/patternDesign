package AbstractFactoryShapeAndColor.implementation;

import AbstractFactoryShapeAndColor.interfaces.Color;

public class Orange implements Color {

    public boolean isPrimaryColor() {
        System.out.println("The orange is NOT a primary Color");
        return false;
    }
}
