package easy

//https://leetcode.com/problems/maximum-value-of-an-ordered-triplet-i/description/

private fun maximumTripletValue(nums: IntArray): Long {
    var max = 0L
    var maxK = nums.lastIndex
    for (i in 0 .. nums.lastIndex-2){
        for(j in i+1 .. nums.lastIndex-1){
            if (j==maxK){
                maxK = nums.lastIndex
            }
            var k = maxK
            while(k>j){
                val temp = ((nums[i]-nums[j]).toLong())*nums[k]
                if (max<temp){
                    max = temp
                    maxK = k
                }
                k--
            }
        }
    }
    return max
}