package easy

//https://leetcode.com/problems/richest-customer-wealth/description/

private fun maximumWealth(accounts: Array<IntArray>): Int {
    var max = 0
    accounts.forEach { person ->
        val currentSum = person.fold(0) { acc, dep -> acc + dep }
        if (max < currentSum) max = currentSum
    }
    return max
}