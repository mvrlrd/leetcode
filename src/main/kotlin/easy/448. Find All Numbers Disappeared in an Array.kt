package easy

//https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/description/

private fun findDisappearedNumbers(nums: IntArray): List<Int> {
    val set = hashSetOf<Int>()
    repeat(nums.size){
        set.add(it+1)
    }
    for (i in 0 .. nums.lastIndex){
        set.remove(nums[i])
    }
    return set.toList()
}
