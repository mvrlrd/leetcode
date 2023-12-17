package easy

//https://leetcode.com/problems/counting-words-with-a-given-prefix/description/

private fun prefixCount(words: Array<String>, pref: String): Int {
    var count = 0
    val start = 0
    val end = pref.length
    for (word in words){
        if (word.length<pref.length) continue
        if (word.substring(start,end) == pref) count++
    }
    return count
}