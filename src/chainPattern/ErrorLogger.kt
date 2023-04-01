package chainPattern

class ErrorLogger(var mLevel: Int) : AbstractLogger() {

    init {
        this.level = mLevel
    }

    override fun write(message: String) {
        println("error console::logger:$message")
    }
}