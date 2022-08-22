fun main()
{
    val firstMatrix = Matrix(arrayOf(intArrayOf(3,-2,5),intArrayOf(3,4,0)),noofRow:2,3)
    val secondMatrix = Matrix(arrayOf(intArrayOf(2,3),intArrayOf(-9,0), intArrayOf(0,4)),3,2)
    val secondMatrix1 = Metrix (arrayOf(intArrayOf(6,3),intArrayOf(9,0), intArrayOf(5,4)),3,2)

    println("==============Addition==========")
    println("metrix1: ")
    println(secondMatrix1)
    println("metrix2: ")
    println(secondMatrix)
    val Addition = secondMatrix1 + secondMatrix
    println("Addition : $Addition")

    println("==============subtraction==========")
    println("metrix1: ")
    println(secondMatrix1)
    println("metrix2: ")
    println(secondMatrix)
    val subtraction = secondMatrix1 - secondMatrix
    println("subtraction : $subtraction")

    println("==============multiplication===========")
    println("metrix1: ")
    println(secondMatrix1)
    println("metrix2: ")
    println(secondMatrix)
    val multiplication = secondMatrix1 * secondMatrix
    println(" multiplication : $multiplication")
}