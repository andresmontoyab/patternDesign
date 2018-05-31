package AbstractFactoryShapeAndColor.factories;

import AbstractFactoryShapeAndColor.implementation.TypesColor;
import AbstractFactoryShapeAndColor.implementation.TypesShapes;
import AbstractFactoryShapeAndColor.interfaces.Color;
import AbstractFactoryShapeAndColor.interfaces.Shape;

public abstract class AbstractFactory {

    public abstract Color getColor(TypesColor color);
    public abstract Shape getShape(TypesShapes shapes);

}
