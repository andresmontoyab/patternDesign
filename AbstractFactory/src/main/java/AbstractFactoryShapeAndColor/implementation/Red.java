package AbstractFactoryShapeAndColor.implementation;

import AbstractFactoryShapeAndColor.interfaces.Color;

public class Red implements Color {

    public boolean isPrimaryColor() {
        System.out.println("The orange is a primary Color");
        return true;
    }
}
