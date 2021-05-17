package abstractFactory;

public class ColorFactory extends AbstractFactory {
    @Override
    Color getColor(String color) {
        if (color == null) {
            return null;
        }
        if ("Blue".equalsIgnoreCase(color)) {
            return new Blue();
        }
        if ("Red".equalsIgnoreCase(color)) {
            return new Red();
        }
        if ("Green".equalsIgnoreCase(color)) {
            return new Green();
        }
        return null;
    }

    @Override
    Shape getShape(String shape) {
        return null;
    }
}
