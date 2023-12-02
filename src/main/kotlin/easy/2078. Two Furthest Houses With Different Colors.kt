package easy

//https://leetcode.com/problems/two-furthest-houses-with-different-colors/description/

fun main(){

}
private fun maxDistance(colors: IntArray): Int {
    var end1 = colors.lastIndex
    val start1 = 0
    val end2 = colors.lastIndex
    var start2 = 0
    while(end1>start1){
        if (colors[end1]!=colors[start1]) {
            return end1-start1
        }
        if (colors[end2]!=colors[start2]) {
            return end2-start2
        }
        end1--
        start2++
    }
    return 0
}