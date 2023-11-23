package easy

//Given an array arr of integers, check if there exist two indices i and j such that :
//
//i != j
//0 <= i, j < arr.length
//arr[i] == 2 * arr[j]
//
//
//Example 1:
//
//Input: arr = [10,2,5,3]
//Output: true
//Explanation: For i = 0 and j = 2, arr[i] == 10 == 2 * 5 == 2 * arr[j]
//Example 2:
//
//Input: arr = [3,1,7,11]
//Output: false
//Explanation: There is no i and j that satisfy the conditions.
//
//
//Constraints:
//
//2 <= arr.length <= 500
//-103 <= arr[i] <= 103

fun main(){
    val arr = intArrayOf(-2,0,10,-19,4,6,-8)
    println(checkIfExist(arr))
}

fun checkIfExist(arr: IntArray): Boolean {
    val set = hashSetOf<Int>()
    for (i in arr){
        if (i%2==0){
            val desire = i/2
            if (set.contains(desire)) return true
        }
        val desire2 = i*2
        if (set.contains(desire2)) return true
        set.add(i)
    }
    return false
}