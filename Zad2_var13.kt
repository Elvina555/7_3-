import kotlin.math.sqrt
fun main() {
    try {
        println("Введите k: ")
        var k = readLine()!!.toDouble()
        println("Введите b: ")
        var b = readLine()!!.toDouble()
        println("Введите a: ")
        var a = readLine()!!.toDouble()
        val dc = b * b + 4 * k * a
        val d = sqrt(dc)
        val d1=a / b
        val d2=-b / (2 * k)
        val d3=b / 2
        val d4=(-b + d) / (2 * k)
        val d5=(b + d) / 2
        val d6=(-b - d) / (2 * k)
        val d7=(b - d) / 2
        if (dc < 0 || (k == 0.0 && b == 0.0)) {
            println("Нет точек пересечения")
        } else if (k == 0.0) {
            println("Одна точка пересечения: (%.2f, %.2f)".format(d1, b))
        } else if (dc == 0.0) {
            println("Одна точка пересечения: (%.2f, %.2f)".format(d2, d3))
        } else {
            println("Две точки пересечения: (%.2f, %.2f) и (%.2f, %.2f)".format(d4, d5, d6, d7))
        }
    }
    catch (e:Exception)
    {
        println("Введен символ")
    }
}