import classes.Car
import classes.Dimensions
import classes.Engine
import classes.EngineType

fun main() {
    val dimensions = Dimensions(2.0, 5.0)
    val engine = Engine(100, 50, EngineType.ELECTRIC)
    val car = Car(dimensions, engine)

    println(car.klaxon())
    println(car.onCharging())
    println("Car dimensions area: ${car.calculate()}")
}
