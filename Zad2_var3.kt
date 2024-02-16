fun main(){
    try {
        println("Введите x")
        var x= readLine()!!.toDouble()
        println("Введите y")
        var y= readLine()!!.toDouble()
        println("Введите z")
        var z= readLine()!!.toDouble()
        var min=Double.MAX_VALUE
        var max=Double.MIN_VALUE
        if(x<z)
        {
            when(x>y)
            {
                true->max=x
                false->max=y
            }
            println("max=$max")
        }
        if(x>=z)
        {
            when(x<y)
            {
                true->min=x
                false->min=y
            }
            println("min=$min")
        }
    }catch (e:Exception)
    {
        println("Введен символ")
    }
}