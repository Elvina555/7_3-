fun main(){
    try{
        println("Введите координаты первой вершины")
        val x1= readLine()!!.toDouble()
        val y1= readLine()!!.toDouble()
        println("Введите координаты второй вершины")
        val x2= readLine()!!.toDouble()
        val y2= readLine()!!.toDouble()
        println("Введите координаты третьей вершины")
        val x3= readLine()!!.toDouble()
        val y3= readLine()!!.toDouble()
        val a=Math.sqrt(((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1)))
        val b=Math.sqrt(((x3-x2)*(x3-x2)+(y3-y2)*(y3-y2)))
        val c=Math.sqrt(((x3-x1)*(x3-x1)+(y3-y1)*(y3-y1)))
        val s=0.5*(Math.abs((x2-x1)*(y3-y1)-(x3-x1)*(y2-y1)))
        val p=a+b+c
        val s1=String.format("%.2f",s)
        val p1=String.format("%.2f",p)
        when(s>0 || p>0)
        {
            true->println("Площадь равна: $s1, периметр равен: $p1")
            false->println("Площадь и периметр не могут быть отрицательными или равны нулю")
        }
    }catch (e:Exception)
    {
        println("Введен символ")
    }
}