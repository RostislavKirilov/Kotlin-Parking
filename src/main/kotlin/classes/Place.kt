package classes

import Vehicle

class Place(width: Double, length: Double) {
    private var vehicle: Vehicle? = null
    private val dimensions = Dimensions(width, length)

    fun getVehicle(): Vehicle? = vehicle

    fun release(): Boolean {
        return if (vehicle != null) {
            vehicle = null
            true
        } else {
            false
        }
    }

    fun isFree(): Boolean = vehicle == null

    fun setVehicle(newVehicle: Vehicle) {
        vehicle = newVehicle
    }
}
