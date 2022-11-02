abstract class car {
    var model: String
        set(modelnumber) { model = modelnumber}
        get() {return model}
    var color: String
        set(colorname) { color = colorname }
        get() {return color}
    var speed: Double
        set(speednumber) {speed = speednumber}
        get() {return speed}

    abstract fun getfuel()
}