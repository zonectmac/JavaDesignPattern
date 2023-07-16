package prototypePattern

class Circle : Shape() {
    init {
        type = "Circle"
    }

    override fun draw() {
        println("Inside Circle::draw() method.");
    }
}