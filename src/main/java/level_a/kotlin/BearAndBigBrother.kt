package level_a.kotlin

import java.io.*

fun main(args: Array<String>){
    val br = BufferedReader(InputStreamReader(System.`in`))
    val input = br.readLine().split("\\s+".toRegex())
    var limak = input[0].toInt()
    var bob = input[1].toInt()
    var years = 0;
    while(limak <= bob){
        limak*=3
        bob*=2
        years++
    }
    print(years)
}