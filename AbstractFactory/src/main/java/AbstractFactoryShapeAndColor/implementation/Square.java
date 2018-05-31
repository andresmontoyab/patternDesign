package AbstractFactoryShapeAndColor.implementation;

import AbstractFactoryShapeAndColor.interfaces.Shape;

public class Square implements Shape {

    public int area(int base, int high) {
        if (base == high) {
            System.out.println("The area of the square is " + base * high);
            return base * high;
        } else {
            System.out.println("The base and high must be equals in a square");
            return 0;
        }
    }
}
