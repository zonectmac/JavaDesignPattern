package builderPattern

class Pepsi : Burger() {
    override fun price(): Float {
        return 35.0f
    }

    override fun name(): String {
        return "Pepsi"
    }
}