package AbstractFactoryShapeAndColor.factories;

import AbstractFactoryShapeAndColor.implementation.Orange;
import AbstractFactoryShapeAndColor.implementation.Red;
import AbstractFactoryShapeAndColor.implementation.TypesColor;
import AbstractFactoryShapeAndColor.implementation.TypesShapes;
import AbstractFactoryShapeAndColor.interfaces.Color;
import AbstractFactoryShapeAndColor.interfaces.Shape;

public class ColorFactory extends AbstractFactory {

    public Color getColor(TypesColor color) {

        Color colorToReturn = null;

        switch (color) {
            case RED:
                colorToReturn = new Red();
                break;
            case ORANGE:
                colorToReturn = new Orange();
                break;
        }

        if (null == colorToReturn) {
            System.out.println("We cant found a color instance of " + color);
        }

        return colorToReturn;
    }

    public Shape getShape(TypesShapes shapes) {
        return null;
    }
}
