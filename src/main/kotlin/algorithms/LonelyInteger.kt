package algorithms

import java.io.*
import java.math.*
import java.security.*
import java.text.*
import java.util.*
import java.util.concurrent.*
import java.util.function.*
import java.util.regex.*
import java.util.stream.*
import kotlin.collections.*
import kotlin.comparisons.*
import kotlin.io.*
import kotlin.jvm.*
import kotlin.jvm.functions.*
import kotlin.jvm.internal.*
import kotlin.ranges.*
import kotlin.sequences.*
import kotlin.text.*

/**
    Given an array of integers, where all elements but one occur twice, find the unique element.

    Example a = [1,2,3,4,3,2,1]

    The unique element is 4.
 */

fun lonelyinteger(a: Array<Int>): Int {
    // Write your code here
    Arrays.sort(a)

    var uniqueElement = -1
    var sizeArray = a.size

    when (sizeArray) {
        1, 2 -> {
            uniqueElement = a[0]
        }
        3 -> {
            uniqueElement = a[2]
        }
        else -> {
            for (i in a.indices) {
                if (i > 0 && i < sizeArray - 1) {
                    if (a[i] != a[i+1] && a[i] != a[i-1]) {
                        uniqueElement = a[i]
                    }
                }

                if (i == sizeArray - 1 && uniqueElement == -1) {
                    uniqueElement = a[i]
                }

            }
        }
    }

    return uniqueElement
}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val a = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val result = lonelyinteger(a)

    println(result)
}
