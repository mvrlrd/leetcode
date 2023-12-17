package easy

//https://leetcode.com/problems/shortest-distance-to-target-string-in-a-circular-array/description/

private fun closetTarget(words: Array<String>, target: String, startIndex: Int): Int {
    var rSteps = -1
    var lSteps = -1
    var i = startIndex
    var count = 0
    while(count<words.size){
        if (words[i]==target){
            rSteps = count
            break
        }
        i++
        count++
        if (i > words.lastIndex){
            i = 0
        }
    }
    i = startIndex
    count = 0
    while(count<words.size){
        if (words[i]==target){
            lSteps = count
            break
        }
        i--
        count++
        if (i < 0){
            i = words.lastIndex
        }
    }
    return rSteps.coerceAtMost(lSteps)

}