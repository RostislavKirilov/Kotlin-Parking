package classes

import interfaces.Volume
class Premises(width: Double, length: Double) : Volume {
    private val dimensions = Dimensions(width, length)

    override fun calculate(): Double {
        return dimensions.width * dimensions.length
    }
}

