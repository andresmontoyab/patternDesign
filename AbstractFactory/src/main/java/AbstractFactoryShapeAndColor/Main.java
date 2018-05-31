package AbstractFactoryShapeAndColor;

import AbstractFactoryShapeAndColor.factories.AbstractFactory;
import AbstractFactoryShapeAndColor.factories.FactoryProducer;
import AbstractFactoryShapeAndColor.factories.TypesFactories;
import AbstractFactoryShapeAndColor.implementation.TypesColor;
import AbstractFactoryShapeAndColor.implementation.TypesShapes;
import AbstractFactoryShapeAndColor.interfaces.Color;
import AbstractFactoryShapeAndColor.interfaces.Shape;

public class Main {
    public static void main(String[] args) {

         AbstractFactory shapeFactory = FactoryProducer.getFactory(TypesFactories.SHAPE);
         AbstractFactory colorFactory = FactoryProducer.getFactory(TypesFactories.COLOR);
         Shape rectangule = shapeFactory.getShape(TypesShapes.RECTANGULE);
         rectangule.area(10, 50);

         Shape square = shapeFactory.getShape(TypesShapes.SQUARE);
         square.area(5,10);
         square.area(5,5);

         Color orange = colorFactory.getColor(TypesColor.ORANGE);
         orange.isPrimaryColor();

         Color red = colorFactory.getColor(TypesColor.RED);
         red.isPrimaryColor();

    }
}
