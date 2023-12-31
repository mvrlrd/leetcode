package easy.binary_trees

//https://leetcode.com/problems/sum-of-left-leaves/description/

private fun sumOfLeftLeaves(root: TreeNode?): Int {
    val list = mutableListOf<Int>()
    leftSum(root, list)
    return list.sum()
}
private fun leftSum(node: TreeNode?, list: MutableList<Int>){
    if (node!=null){
        node.left?.let{
            if ((it.left == null)&&(it.right==null)){
                list.add(it.`val`)
            }
            leftSum(it, list)
        }
        leftSum(node.right, list)
    }
}