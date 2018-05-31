# Design Patterns

## Singletoon

Se usa cuando siempre una instancia de algo será lo mismo, por ejemplo un acceso a base de datos o un sistema de archivos.

Este patron de diseño consiste en solo tener una instancia por clase o instancia global.

## Factory Method.

Es uno de los patrones de diseño mas usados en Java. Es un patron de diseño creational.

En este patron crearemos un objeto sin necesidad de exponer la logica de creacion del objeto a el cliente y crear el nuevo objeto usando una interface comun.

En este patron definiremos los siguientes elementos

	1. Interface: La interface tendrá los metodos que cada una de las clases deberá implementar con los cuales se asegure un comportamiento deseado.

	2. Clases Concretas: Las clases concretas deberan implementar de la interfaz e implementar los metodos.

	3. Factory: El factory se encargará de crear las instancias que sean solicitadas, por medio de una logica de comparacion.

		public class WeaponFactory {

	    private static final Weapon INSTANCE_BOW = new Bow();
	    private static final Weapon INSTANCE_ROD = new Rod();
	    private static final Weapon INSTANCE_AXE = new Axe();

	    public static Weapon getInstance(WeaponTypes weapon) {

	        Weapon weaponInstance = null;

	        switch (weapon) {
	            case BOW:
	                weaponInstance = INSTANCE_BOW;
	                break;
	            case AXE:
	                weaponInstance = INSTANCE_AXE;
	                break;
	            case ROD:
	                weaponInstance = INSTANCE_ROD;
	                break;
	            }

	            if (null == weaponInstance) {
	                System.out.println("We doesnt found a instance of the type " + weapon.toString());
	            }
	            return weaponInstance;

	    }


## Abstract Factory

Se define una fabrica de objetos de una familia de productos, en esta fabrica se especifica la creacion concreta de cada una de las partes del objeto.

El Factory Abstract esta orientado a la construccion de objetos en sus subclases.

Este patron esta conformado por las siguientes partes.

	1. Factory Producer: El factory producer tendrá la tarea de retornar unas de las fabricas segund los parametros de entrada.

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

	2. Abstract Factory

			public abstract class AbstractFactory {

			    public abstract Color getColor(TypesColor color);
			    public abstract Shape getShape(TypesShapes shapes);

			}

	3. Factorys Concretas

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

	4. Interfaces


		public interface Color {
		    boolean isPrimaryColor();
		}

		public interface Shape {
		    int area(int base, int high);
		}

	5. Clases Concretas

		public class Red implements Color {

		    public boolean isPrimaryColor() {
		        System.out.println("The orange is a primary Color");
		        return true;
		    }
		}

		public class Orange implements Color {

		    public boolean isPrimaryColor() {
		        System.out.println("The orange is NOT a primary Color");
		        return false;
		    }
		}

		public class Rectangule implements Shape {

		    public int area(int base, int high) {
		        System.out.println("The area of the rectangule is "  + base * high);
		        return base * high;
		    }
		}

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

## Builder

El Builder esta orientado a la construccion de objetos complejos.








## Composite