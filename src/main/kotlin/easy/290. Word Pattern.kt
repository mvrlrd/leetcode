package easy

//https://leetcode.com/problems/word-pattern/description/

private fun wordPattern(pattern: String, s: String): Boolean {
    val map = hashMapOf<Char, String>()
    val map2 = hashMapOf<Char, String>()

    val arr = s.split(" ")

    if (arr.size != pattern.length) return false

    for (i in 0 .. pattern.lastIndex){
        val ch = pattern[i]
        val word = arr[i]
        if (!map.containsKey(ch)){
            if (map.containsValue(word)) return false
            map[ch] = word
        }else{
            if (word != map[ch]) return false
        }

    }
    val f = DoubleArray(1)
    return true
}