package easy

//https://leetcode.com/problems/alternating-digit-sum/description/

private fun alternateDigitSum(n: Int): Int {
    val str = n.toString()
    val arr = str.toCharArray()
    var sum = 0
    for(i in arr.indices){
        val a = if (i%2==0) 1 else -1
        sum += arr[i].digitToInt()*a
    }
    return sum
}