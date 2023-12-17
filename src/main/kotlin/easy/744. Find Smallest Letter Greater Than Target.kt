package easy

//https://leetcode.com/problems/find-smallest-letter-greater-than-target/description/

private fun nextGreatestLetter(letters: CharArray, target: Char): Char {
    var min = 'z'-target
    var res = letters[0]
    for (ch in letters){
        //   println("$ch = ${ch.toInt()}")

        if (ch - target <= 0) continue
        if (ch - target <= min) {
            min = ch - target
            res = ch
        }
    }
    return res
}