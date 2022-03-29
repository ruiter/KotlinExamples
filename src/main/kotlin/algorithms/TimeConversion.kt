package algorithms

import java.text.*
import java.util.*
import kotlin.io.*

/**
 * Given a time in -hour AM/PM format, convert it to military (24-hour) time.

Note: - 12:00:00AM on a 12-hour clock is 00:00:00 on a 24-hour clock.
- 12:00:00PM on a 12-hour clock is 12:00:00 on a 24-hour clock.

Example

s = '12:01:00PM'
Return '12:01:00'.

s = '12:01:00AM'
Return '00:01:00'.
 */

fun timeConversion(s: String): String {
    // Write your code here

    val sdf = SimpleDateFormat("hh:mm:ssaa")

    var dateObj: Date? = null

    try {
        dateObj = sdf.parse(s)
    } catch (e: ParseException) {
        e.printStackTrace()
    }

    return SimpleDateFormat("HH:mm:ss").format(dateObj)
}

fun main(args: Array<String>) {
    val s = readLine()!!

    val result = timeConversion(s)

    println(result)
}
