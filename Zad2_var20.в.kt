import kotlin.math.pow
fun main()
{
    try
    {
        println("Введите x: ")
        var x = readLine()!!.toDouble()
        var y=0.0
        if (x>=-1)
        {
            when
            {
                x<=0 &&x>=-1 -> y = x+1
                x>0&&x<=1 -> y=x
                x>3&&x<=4 -> y=x*0.5-0.5
                else -> y = 1.0
            }
            println("Функция равна: $y")
        }
        else println("х не должен быть меньше -1")
    }catch (e:Exception)
    {
        println("Введен символ")
    }
}