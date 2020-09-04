package level_a.kotlin

import java.io.BufferedReader
import java.io.InputStreamReader

fun main(args: Array<String>){
    val br = BufferedReader(InputStreamReader(System.`in`))
    var answers = 0
    for(i in 1..br.readLine().toInt()){
        val questionPoll = br.readLine().split("\\s+".toRegex())
        val total = questionPoll[0].toInt() + questionPoll[1].toInt() + questionPoll[2].toInt()
        if(total >=2)
            answers++
    }
    print(answers)
}