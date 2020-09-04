package level_a.kotlin

import java.io.BufferedReader
import java.io.InputStreamReader
import java.lang.StringBuilder

fun main(args: Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))
    br.readLine()
    val row = br.readLine().split("\\s+".toRegex())
    val sortedRow = row.sortedBy { i -> i.toInt() }
    val sb = StringBuilder()
    for (i in sortedRow)
        sb.append("$i ")
    sb.deleteCharAt(sb.length - 1)
    print(sb.toString())
}