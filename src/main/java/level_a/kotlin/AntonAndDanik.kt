package level_a.kotlin

import java.io.BufferedReader
import java.io.InputStreamReader

fun main(args: Array<String>){
    val br  = BufferedReader(InputStreamReader(System.`in`))
    br.readLine()
    val games  = br.readLine()
    var danik = 0
    var anton = 0
    for( game in games){
        if(game == 'A')
            anton++
        else
            danik++
    }
    print(
            if(anton > danik){
                "Anton"
            }else if(danik > anton){
                "Danik"
            }else{
                "Friendship"
            }
    )
}