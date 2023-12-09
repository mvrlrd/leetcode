package easy

//https://leetcode.com/problems/maximum-number-of-words-you-can-type/

private fun canBeTypedWords(text: String, brokenLetters: String): Int {
    val arr = text.split(" ")
    var count = 0
    for (i in 0 .. arr.lastIndex){
        for (j in 0 .. arr[i].lastIndex){
            if (brokenLetters.contains(arr[i][j])){
                break
            }
            if (j == arr[i].lastIndex){
                count++
            }
        }

    }
    return count
}