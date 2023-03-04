package abstractFactoryPattern;


public class ShapeFactory extends AbstractFactory {
    @Override
    Color getColor(String color) {
        return null;
    }

    @Override
    Shape getShape(String shape) {
        if (shape == null) {
            return null;
        }
        if ("Circle".equalsIgnoreCase(shape)) {
            return new Circle();
        }
        if ("Square".equalsIgnoreCase(shape)) {
            return new Square();
        }
        if ("Rectangle".equalsIgnoreCase(shape)) {
            return new Rectangle();
        }
        return null;
    }
}
