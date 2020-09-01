package level_a.kotlin

import java.io.*
import java.nio.charset.Charset

fun main(args: Array<String>) {
    val data = "HoUsE"
    val inStream = ByteArrayInputStream(data.toByteArray(Charset.forName("UTF-8")))
    System.setIn(inStream)
    val br = BufferedReader(InputStreamReader(System.`in`))

    val word = br.readLine()
    var lower = 0
    var upper = 0
    for (c in word) {
        if (Character.isUpperCase(c))
            upper++
        else
            lower++
    }

    var sb = StringBuilder()
    if (upper > lower) {
        for (c in word)
            sb.append(c.toUpperCase())
    } else {
        for (c in word)
            sb.append(c.toLowerCase())
    }
    print(sb)
}