package easy.binary_trees

//https://leetcode.com/problems/minimum-distance-between-bst-nodes/description/


fun minDiffInBST(root: TreeNode?): Int {
    val list = mutableListOf<Int>()
    explore(root, list)
    list.sort()
    var min = list[1]-list[0]
    var prev = list[0]
    for (cur in 1 .. list.lastIndex){
        val dif = list[cur] - prev
        if (dif<min) min = dif
        prev = list[cur]
    }
    return min
}

