import kotlin.math.pow
fun main()
{
    try
    { println("Введите x: ")
        var x = readLine()!!.toDouble()
        var y=0.0
        if (x>=-1)
        {
            when
            {
                x<=1 &&x>=-1 ->y = Math.sqrt(x.pow(2) + 1)
                x>1 -> y=x-1
            }
            println("Функция равна: ${String.format("%.2f",y)}")
        }
        else println("х не должен быть меньше -1")
    }catch (e:Exception)
    {
        println("Введен символ")
    }
}