package AbstractFactoryShapeAndColor.factories;

import AbstractFactoryShapeAndColor.implementation.Rectangule;
import AbstractFactoryShapeAndColor.implementation.Square;
import AbstractFactoryShapeAndColor.implementation.TypesColor;
import AbstractFactoryShapeAndColor.implementation.TypesShapes;
import AbstractFactoryShapeAndColor.interfaces.Color;
import AbstractFactoryShapeAndColor.interfaces.Shape;

public class ShapeFactory extends AbstractFactory {

    public Shape getShape(TypesShapes shape) {

        Shape shapeToReturn = null;

        switch (shape) {
            case SQUARE:
                shapeToReturn = new Square();
                break;
            case RECTANGULE:
                shapeToReturn = new Rectangule();
                break;
        }

        if (null == shapeToReturn) {
            System.out.println("There's no shape instance of the " + shape.toString());
        }

        return shapeToReturn;
    }

    public Color getColor(TypesColor color) {
        return null;
    }
}
