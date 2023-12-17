package easy

//https://leetcode.com/problems/teemo-attacking/

private fun findPoisonedDuration(timeSeries: IntArray, duration: Int): Int {
    var time = 0
    var end = 0
    var prev = 0
    for (i in 0 .. timeSeries.lastIndex){
        if (end <= timeSeries[i]){
            time += duration
        }else{
            time += timeSeries[i] - prev
        }
        prev = timeSeries[i]
        end = timeSeries[i] + duration
    }
    return time
}