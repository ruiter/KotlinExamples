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
 *  Given an array of integers, calculate the ratios of its elements that are positive, negative, and zero.
 *  Print the decimal value of each fraction on a new line with  places after the decimal.
 *  Note: This challenge introduces precision problems. The test cases are scaled to six decimal places,
 *  though answers with absolute error of up to  are acceptable.

Print

    Print the ratios of positive, negative and zero values in the array.
    Each value should be printed on a separate line with  digits after the decimal. The function should not return a value.

Sample Input

    STDIN           Function
    -----           --------
    6               arr[] size n = 6
    -4 3 -9 0 4 1   arr = [-4, 3, -9, 0, 4, 1]

    Sample Output

    0.500000
    0.333333
    0.166667
 */

fun plusMinus(arr: Array<Int>): Unit {
    // Write your code here

    var countNegative = 0.0
    var countPositive = 0.0
    var countZeros = 0.0

    var tam = arr.size
    for (items in arr) {


        if (items < 0.0)
            countNegative++
        else if (items > 0.0)
            countPositive++
        else
            countZeros++
    }

    val resultPositives: Double = countPositive / tam
    val resultNegatives: Double = countNegative / tam
    val resultZeros: Double = countZeros / tam

    println(String.format("%.6f", resultPositives))
    println(String.format("%.6f", resultNegatives))
    println(String.format("%.6f", resultZeros))

}
