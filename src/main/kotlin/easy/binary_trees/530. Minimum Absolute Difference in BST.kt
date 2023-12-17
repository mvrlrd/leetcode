package easy.binary_trees

//https://leetcode.com/problems/minimum-absolute-difference-in-bst/description/

private fun getMinimumDifference(root: TreeNode?): Int {
    val nodes = mutableListOf<Int>()
    root?.let {
        explore(root, nodes)
    }
    nodes.sort()
    var min: Int = nodes[1] - nodes[0]
    for (i in 0..nodes.lastIndex - 1) {
        val dif = nodes[i + 1] - nodes[i]
        min = dif.coerceAtMost(min)
    }
    return min

}

private fun explore(node: TreeNode, nodes: MutableList<Int>) {
    nodes.add(node.`val`)
    node.left?.let {
        explore(it, nodes)
    }
    node.right?.let {
        explore(it, nodes)
    }
}