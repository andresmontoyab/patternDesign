package AbstractFactoryShapeAndColor.factories;

public class FactoryProducer {

    private static final AbstractFactory INSTANCE_SHAPE = new ShapeFactory();
    private static final AbstractFactory INSTANCE_COLOR = new ColorFactory();

    public static  AbstractFactory getFactory(TypesFactories factory) {
        AbstractFactory factoryToReturn = null;

        switch (factory) {
            case COLOR:
                factoryToReturn = INSTANCE_COLOR;
                break;
            case SHAPE:
                factoryToReturn = INSTANCE_SHAPE;
                break;
        }
        if (null == factoryToReturn) {
            System.out.println("There's no factory with this name : "+ factory);
        }

        return factoryToReturn;
    }
}
