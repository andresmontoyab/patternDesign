package AbstractFactoryShapeAndColor.implementation;

import AbstractFactoryShapeAndColor.interfaces.Shape;

public class Rectangule implements Shape {

    public int area(int base, int high) {
        System.out.println("The area of the rectangule is "  + base * high);
        return base * high;
    }
}
