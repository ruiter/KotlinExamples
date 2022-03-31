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

/*
 * Complete the 'countingSort' function below.
 *
 * The function is expected to return an INTEGER_ARRAY.
 * The function accepts INTEGER_ARRAY arr as parameter.

* Challenge
    Given a list of integers, count and return the number of times each value appears as an array of integers.
    almost a solution with sorted array
        if (i == arr.size - 1) {

            if (arr[i] == lastChecked) {
                resultArr[arr[i]] = countValues
            }
        } else if (arr[i] == arr[i+1]) {
            countValues++
            lastChecked = arr[i]
        } else if(arr[i] == lastChecked) {
            resultArr[arr[i]] = countValues
            countValues = 1

        }
 */

fun countingSort(arr: Array<Int>): Array<Int> {
    // Write your code here

    Arrays.sort(arr)
    var resultArr = Array(100) { 0 }

    for (item in arr) {

        resultArr[item]++
    }

    return resultArr
}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val arr = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val result = countingSort(arr)

    println(result.joinToString(" "))
}
