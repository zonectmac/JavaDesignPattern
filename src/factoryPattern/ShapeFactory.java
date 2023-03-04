package factoryPattern;

/**
 * 普通工厂
 */
public class ShapeFactory {
    /**
     * 获取形状类型的对象
     *
     * @param shapeType
     * @return
     */
    public Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        if ("Circle".equalsIgnoreCase(shapeType)) {
            return new Circle();
        }
        if ("Square".equalsIgnoreCase(shapeType)) {
            return new Square();
        }
        if ("Rectangle".equalsIgnoreCase(shapeType)) {
            return new Rectangle();
        }
        return null;
    }
}
