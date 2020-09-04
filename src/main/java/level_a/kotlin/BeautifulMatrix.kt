package level_a.kotlin

import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.abs

fun main(args: Array<String>){
    val br = BufferedReader(InputStreamReader(System.`in`))
    var row = 0
    var col = 0
    for(i in 0..4){
        val inputRow = br.readLine().split("\\s+".toRegex())
        for(j in 0..4){
            if(inputRow[j] == "1"){
                row = i
                col = j
            }
        }
    }
    print(abs(row-2) + abs(col-2))
}