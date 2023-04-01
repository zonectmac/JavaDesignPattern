package chainPattern

class FileLogger(var mLevel: Int) : AbstractLogger() {
    init {
        this.level = mLevel
    }

    override fun write(message: String) {
        println("file::logger:$message")
    }
}