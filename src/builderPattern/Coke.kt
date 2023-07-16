package builderPattern

class Coke : Burger() {
    override fun price(): Float {
        return 30.0f
    }

    override fun name(): String {
        return "Coke"
    }
}