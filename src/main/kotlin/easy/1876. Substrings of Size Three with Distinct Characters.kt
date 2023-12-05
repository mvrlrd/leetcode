package easy

//https://leetcode.com/problems/substrings-of-size-three-with-distinct-characters/description/

private fun countGoodSubstrings(s: String): Int {
    var start = 0
    var end = 3
    var count = 0
    while (end<=s.length){
        val sub = s.substring(start,end)
        if ((sub[0]!=sub[1])
            &&(sub[0]!=sub[2])
            &&(sub[1]!=sub[2])){
            count++
        }
        start++
        end++
    }
    return count
}