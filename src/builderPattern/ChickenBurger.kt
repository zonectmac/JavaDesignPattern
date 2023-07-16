package builderPattern

class ChickenBurger : Burger() {
    override fun price(): Float {
        return 50.0f
    }

    override fun name(): String {
        return "chicken burger"
    }
}