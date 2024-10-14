import classes.Dimensions
import classes.Engine
import interfaces.Charging
import interfaces.Volume

abstract class Vehicle(val dimensions: Dimensions, val engine: Engine) : Charging, Volume {
    abstract fun klaxon(): String
    abstract override fun onCharging(): String
    abstract fun retrieveEngine(): Engine
    abstract override fun calculate(): Double
}
