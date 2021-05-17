package abstractFactory;

/**
 * 抽象工厂实现类
 * 抽象工厂就是对普通工厂的扩展
 */
public class AbstractFactoryPatternDemo {
    public static void main(String[] args) {
        // 获取形状工厂
        AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");
        // 获取形状对象
        Shape circle = shapeFactory.getShape("Circle");
        // 获取形状对象的方法
        circle.draw();


        AbstractFactory colorFactory = FactoryProducer.getFactory("Color");
        Color red = colorFactory.getColor("Red");
        red.fill();
    }
}
