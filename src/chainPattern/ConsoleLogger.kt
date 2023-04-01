package chainPattern

class ConsoleLogger(var mLevel: Int) : AbstractLogger() {
    init {
        this.level = mLevel
    }

    override fun write(message: String) {
        println("standard console::logger: $message")
    }
}