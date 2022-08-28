import java.math.BigInteger

fun main()
{
    print("Enter Num: ")
    var num:BigInteger=readLine()!!.toBigInteger()

    println("Factorial of $num is: ${fact1(num)}")
    println("with tarlrec factorial = : ${fact(num)}")
}
tailrec fun fact(n:BigInteger,temp: BigInteger= BigInteger("1")):BigInteger{
    return if(n == BigInteger("1")){
        temp
    }else{
        fact(n-BigInteger("1"), temp*n)
    }
}
fun fact1(n:BigInteger,temp: BigInteger= BigInteger("1")):BigInteger{
    return if(n == BigInteger("1")){
        temp
    }else{
        fact(n-BigInteger("1"), temp*n)
    }
}
