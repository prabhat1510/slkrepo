package designpattern.factory;

public abstract class ShapeFactory {

	public static Shape getShape(ShapeType name) {
		Shape shape = null;
		switch (name) {
			case LINE:
				shape = new Line();
				break;
			case CIRCLE:
				shape = new Circle();
				break;
			case RECTANGLE:
				shape = new Rectangle();
				break;
			}

		return shape;
	}

}
