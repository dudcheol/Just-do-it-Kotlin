class Plane {
    val canFly: Boolean = true
    var family: String = "Unknown" // 할당 가능
}

class Point3D {
    var x: Int = 0
    var y: Int = 0
    var z: Int = 0
}

fun main() {
    var plane: Plane = Plane()
    /* operation */
    plane = Plane()
    // plane.canFly = false -> val 이므로
    plane.family = "Airbus A320"
    fun createPoint(x: Int, y: Int, z: Int): Point3D {
        // provide implementation here
        val p = Point3D()
        p.x = x
        p.y = y
        p.z = z
        return p
    }

    fun createPoint2(x: Int, y: Int, z: Int): Point3D = Point3D().also {
        it.x = x
        it.y = y
        it.z = z
    }
}