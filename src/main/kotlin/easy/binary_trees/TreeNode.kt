package easy.binary_trees

class TreeNode(val `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}


fun explore(node: TreeNode?, list: MutableList<Int>){
    if (node!=null){
        visit(node, list)
        explore(node.left, list)
        explore(node.right,list)
    }
}
fun visit(node: TreeNode, list: MutableList<Int>){
    list.add(node.`val`)
}