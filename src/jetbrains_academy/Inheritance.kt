package jetbrains_academy

open class Wood(val age: Int) {
    fun getWoodInfo(): String {
        return "age $age"
    }
}

class Pine(val isSpiny: Boolean, age: Int) : Wood(age) { /* ':' 다음이 function에서는 return타입이었지만, */
    fun getPineInfo(): String {                          /* class에서는 상속에 해당 */
        return getWoodInfo() + ", spiny $isSpiny"
    }
}

open class House(val rooms: Int, price: Int) {
    val price: Int

    init {
        this.price = if (price <= 0) 0 else if (price >= 1_000_000) 1_000_000 else price
    }

    open fun totalPrice(): Int = price

    companion object {
        fun createHouse(rooms: Int, price: Int): House {
            return when (rooms) {
                in Int.MIN_VALUE..1 -> Cabin(rooms, price)
                in 2..3 -> Bungalow(rooms, price)
                in 4..4 -> Cottage(rooms, price)
                in 5..7 -> Mansion(rooms, price)
                in 8..10 -> Palace(rooms, price)
                else -> Cabin(rooms, price)
            }
        }
    }
}

class Cabin(rooms: Int, price: Int) : House(rooms, price) {
    private val coefficient = 1.0
    override fun totalPrice(): Int = price * coefficient.toInt()
}

class Bungalow(rooms: Int, price: Int) : House(rooms, price) {
    private val coefficient = 1.2
    override fun totalPrice(): Int = price * coefficient.toInt()
}

class Cottage(rooms: Int, price: Int) : House(rooms, price) {
    private val coefficient = 1.25
    override fun totalPrice(): Int = price * coefficient.toInt()
}

class Mansion(rooms: Int, price: Int) : House(rooms, price) {
    private val coefficient = 1.4
    override fun totalPrice(): Int = price * coefficient.toInt()
}

class Palace(rooms: Int, price: Int) : House(rooms, price) {
    private val coefficient = 1.6
    override fun totalPrice(): Int = price * coefficient.toInt()
}

fun totalPrice(house: House): Int {
    return house.totalPrice()
}

fun main() {
    val pine = Pine(true, 3)
    println(pine.getPineInfo() + ", " + pine.getWoodInfo())

    val rooms = readLine()!!
    val price = readLine()!!
    val house = House.createHouse(rooms.toInt(), price.toInt())
    println(totalPrice(house))
}