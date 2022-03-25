fun main(){
    val point1 = Point(5.0, -2.0)
    val point2 = Point(5.0, -5.5)
    println(point1)
    println(point1.isEqual(point2))
    println(point1.Distance(point2))
    point1.Transform()
    println(point1)


}