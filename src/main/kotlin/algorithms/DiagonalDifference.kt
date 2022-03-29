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
import kotlin.math.abs
import kotlin.ranges.*
import kotlin.sequences.*
import kotlin.text.*

/**
    Given a square matrix, calculate the absolute difference between the sums of its diagonals.

    For example, the square matrix arr is shown below:

    1 2 3
    4 5 6
    7 8 9

    The left-to-right diagonal = 1 + 5 + 9 = 15. The right to left diagonal = 3 + 5 + 7 = 17.
    Their absolute difference is |15 - 17| = 2.

 */

fun diagonalDifference(arr: Array<Array<Int>>): Int {
    // Write your code here
    var sizeArray = arr.size
    var result = 0

    for (i in arr.indices) {
        result += arr[i][i] - arr[i][sizeArray - i - 1]
    }

    return abs(result)
}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val arr = Array<Array<Int>>(n, { Array<Int>(n, { 0 }) })

    for (i in 0 until n) {
        arr[i] = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()
    }

    val result = diagonalDifference(arr)

    println(result)
}
