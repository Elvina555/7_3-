fun main()
{
    try
    {
        println("Введите длину окружности")
        val l= readLine()!!.toDouble()
        val p=3.13
        val s=l*l/(4*p)
        val s1=String.format("%.2f",s)
        when(l>0)
        {
            true-> println("Площадь круга равна: $s1")
            false-> println("Длина окружности не может быть равна 0 или меньше нуля")
        }

    }catch (e:Exception)
    {
        println("Введен символ")
    }
}
