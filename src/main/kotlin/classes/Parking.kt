package classes

import Vehicle

class Parking(width: Double, length: Double, placeCount: Int) {
    private val places: ArrayList<Place> = ArrayList()

    init {
        repeat(placeCount) {
            places.add(Place(2.0, 2.0))
        }
    }

    fun addVehicle(vehicle: Vehicle): Boolean {
        val freePlace = places.find { it.isFree() }
        return if (freePlace != null) {
            freePlace.setVehicle(vehicle)
            true
        } else {
            false
        }
    }

    fun release(position: Int): Boolean {
        if (position in places.indices) {
            return places[position].release()
        }
        return false
    }
}

