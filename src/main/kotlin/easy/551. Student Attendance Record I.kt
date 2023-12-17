package easy

//https://leetcode.com/problems/student-attendance-record-i/description/

private fun checkRecord(s: String): Boolean {
    var countA = 0
    var countL = 0

    for (ch in s){
        if (ch == 'A') countA++
        if (countA >= 2) return false
        if (ch == 'L'){
            countL++
            if (countL == 3) return false
        }else{
            countL = 0
        }
    }
    return true
}