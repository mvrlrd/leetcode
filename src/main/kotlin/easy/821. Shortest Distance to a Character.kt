package easy

//https://leetcode.com/problems/shortest-distance-to-a-character/description/

private fun shortestToChar(s: String, c: Char): IntArray {
    var l = 0
    var r = 0
    val res = IntArray(s.length) { s.length }
    var toRight = false
    for (i in 0..s.lastIndex) {
        r = if (s[i] != c) {
            if (toRight) {
                r + 1
            } else {
                s.length
            }
        } else {
            toRight = true
            0
        }
        res[i] = r
    }


    for (j in s.lastIndex downTo 0) {
        l = if (s[j] != c) {
            if (!toRight) {
                l + 1
            } else {
                s.length
            }
        } else {
            toRight = false
            0
        }
        res[j] = res[j].coerceAtMost(l)
    }
    // println(res.contentToString())
    return res
}