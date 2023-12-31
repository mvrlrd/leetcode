package easy

//https://leetcode.com/problems/count-distinct-numbers-on-board/description/

private fun distinctIntegers(n: Int): Int {
    val set = hashSetOf<Int>()
    set.add(n)
    getNum(n, set)
    return set.size
}
private fun getNum(cur: Int, set:HashSet<Int>){
    var count = cur-1
    while(count>0){
        if (cur%count==1) {
            set.add(count)
            getNum(count, set)
            break
        }
        count--
    }

}
