import kotlin.math.pow
import kotlin.math.sqrt

class Point(num1: Double, num2: Double) {
    var x = num1
    var y = num2



    fun isEqual(point2: Point?): Boolean {
        if (this === point2) {
            return true
        } else if (point2 == null || this.javaClass != point2.javaClass) {
            return false
        } else {
            return this.x == point2.x && this.y == point2.y
        }
    }
    fun Transform(){
        x = -x
        y = -y
    }

    fun Distance(OtherPoint: Point): Double{

        var D = sqrt((this.x - OtherPoint.x).pow(2) + (this.y - OtherPoint.y).pow(2))
        return D
    }

    override fun toString(): String {
        return "a = $x, b = $y"
    }
}