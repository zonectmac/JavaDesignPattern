package prototypePattern

abstract class Shape : Cloneable {
    private var id: String? = null
    protected var type: String? = null

    abstract fun draw()

    open fun getType(): String? {
        return type
    }

    open fun getId(): String? {
        return id
    }

    open fun setId(id: String?) {
        this.id = id
    }

    public override fun clone(): Any {
        var clone: Any? = null
        try {
            clone = super.clone()
        } catch (e: CloneNotSupportedException) {
            e.printStackTrace()
        }
        return clone!!
    }
}