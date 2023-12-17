package easy

//https://leetcode.com/problems/count-binary-substrings/

private fun countBinarySubstrings(s: String): Int {
    var count = 0
    var one = 0
    var nill = 0
    var isOne = (s[0] ==  '1')
    for (i in 0 .. s.lastIndex){
        if (s[i] == '0'){
            if (isOne){
                nill = 0
            }
            nill++
            isOne = false
        }else{
            if (!isOne){
                one = 0
            }
            one++
            isOne = true
        }
        if ((nill>0)&&(one>0)){
            count++
            if (nill == one){
                if (isOne) nill = 0 else one = 0
            }

        }
    }
    return count
}