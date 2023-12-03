package easy

//https://leetcode.com/problems/check-if-array-is-good/description/
private fun isGood(nums: IntArray): Boolean {
    if (nums.size < 2) return false
    nums.sort()
    if (nums[nums.lastIndex] != nums[nums.lastIndex - 1]) return false
    for (i in 0 until nums.lastIndex) {
        if (i != nums[i] - 1) return false
    }
    return true
}