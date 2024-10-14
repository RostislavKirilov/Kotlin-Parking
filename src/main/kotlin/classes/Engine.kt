package classes
class Engine(val maxQuantity: Int, var quantity: Int, val engineType: EngineType) {
    fun updateQuantity(newQuantity: Int) {
        quantity = newQuantity.coerceAtMost(maxQuantity)
    }
}