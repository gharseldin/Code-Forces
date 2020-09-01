package level_a.kotlin

import java.io.*

fun main(args: Array<String>){
    val br = BufferedReader(InputStreamReader(System.`in`))
    br.readLine()
    val cards = br.readLine().split("\\s+".toRegex())
    val players = arrayOf(0,0)
    var i = 0;
    var j = cards.size-1
    for(k in cards.indices){
        players[k%2]+= if (cards[i].toInt()>cards[j].toInt()){
            cards[i++].toInt()
        }else{
            cards[j--].toInt()
        }
    }
    print("${players[0]} ${players[1]}")
}