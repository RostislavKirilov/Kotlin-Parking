package classes

import Vehicle
class Car(dimensions: Dimensions, engine: Engine) : Vehicle(dimensions, engine) {
    override fun klaxon(): String {
        return "Beep beep!"
    }

    override fun onCharging(): String {
        return if (engine.engineType == EngineType.ELECTRIC) {
            when (engine.quantity) {
                in 75..99 -> {
                    engine.updateQuantity(engine.maxQuantity)
                    "Charging 300ms"
                }
                in 55..74 -> {
                    engine.updateQuantity(engine.maxQuantity)
                    "Charging 450ms"
                }
                else -> {
                    engine.updateQuantity(engine.maxQuantity)
                    "Charging 900ms"
                }
            }
        } else {
            "ICE is not charging"
        }
    }

    override fun retrieveEngine(): Engine = engine

    override fun calculate(): Double {
        return dimensions.width * dimensions.length
    }
}
