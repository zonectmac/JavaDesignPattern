package builderPattern

class VegBurger : Burger() {
    override fun price(): Float {
        return 25.0f
    }

    override fun name(): String {
        return "veg burger"
    }
}