fun main() {
    var arr1 = IntArray(5)
    //until
    for(i in 0 until arr1.size)
    {
        print("a[$i]: ")
        arr1[i]= readLine()!!.toInt()
    }
    var maxNum:Int
    maxNum=arr1[0]
    for (i in arr1) {
        if(maxNum<i)
        {
            maxNum=i
        }
    }
    println("Max number is: $maxNum")
}