package abstractFactoryPattern;

/**
 * 抽象工厂
 */
public abstract class AbstractFactory {
    abstract Color getColor(String color);
    abstract Shape getShape(String shape);
}
