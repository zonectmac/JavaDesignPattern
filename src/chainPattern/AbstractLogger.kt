package chainPattern

abstract class AbstractLogger {
    companion object{
        const val INFO: Int = 1
        const val DEBUG: Int = 2
        const val ERROR: Int = 3
    }

    var level: Int = 0

    private var nextLogger: AbstractLogger? = null

    fun setNextLogger(nextLogger: AbstractLogger) {
        this.nextLogger = nextLogger
    }

    fun logMessage(level: Int, message: String) {
        if (this.level <= level) {
            write(message)
        }
        if (nextLogger != null) {
            nextLogger?.logMessage(level, message)
        }
    }

    abstract fun write(message: String)

}