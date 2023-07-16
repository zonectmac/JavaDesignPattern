package prototypePattern

import java.util.*

class ShapeCache {
    private val shapeMap: Hashtable<String, Shape> = Hashtable<String, Shape>()

    fun getShape(shapeId: String?): Shape {
        val cachedShape: Shape? = shapeMap[shapeId]
        return cachedShape?.clone() as Shape
    }

    // 对每种形状都运行数据库查询，并创建该形状
    // shapeMap.put(shapeKey, shape);
    // 例如，我们要添加三种形状
    fun loadCache() {
        val circle = Circle()
        circle.setId("1")
        shapeMap[circle.getId()] = circle
        val square = Square()
        square.setId("2")
        shapeMap[square.getId()] = square
        val rectangle = Rectangle()
        rectangle.setId("3")
        shapeMap[rectangle.getId()] = rectangle
    }
}