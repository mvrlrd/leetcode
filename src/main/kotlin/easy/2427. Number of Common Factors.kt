package easy

//Given two positive integers a and b, return the number of common factors of a and b.
//
//An integer x is a common factor of a and b if x divides both a and b.
//
//
//
//Example 1:
//
//Input: a = 12, b = 6
//Output: 4
//Explanation: The common factors of 12 and 6 are 1, 2, 3, 6.
//Example 2:
//
//Input: a = 25, b = 30
//Output: 2
//Explanation: The common factors of 25 and 30 are 1, 5.
//
//
//Constraints:
//
//1 <= a, b <= 1000

fun main(){
    val a = 12
    val b = 6
    println(commonFactors(a, b))
}

private fun commonFactors(a: Int, b: Int): Int {
    val min = a.coerceAtMost(b)
    val max = a.coerceAtLeast(b)
    var count = 0
    for (i in 1 .. min){
        if ((max%i==0)&&(min%i==0)){
            count++
        }
    }
    return count
}