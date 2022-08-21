fun main()
{
    println("enter the month");
    val month:Int= readLine()!!.toInt();
    when(month)
    {
        1->{ println("jan") }
        2->{ println("feb") }
        3->{ println("march") }
        4->{ println("april") }
        5->{ println("may") }
        6->{ println("jun") }
        7->{ println("july") }
        8->{ println("aug") }
        9->{ println("supt") }
        10->{ println("oct") }
        11->{ println("nov") }
        12->{ println("dec") }

        else->{ println("enter proper month") }
    }
}