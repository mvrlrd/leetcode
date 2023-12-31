package easy.binary_trees

import java.util.*

//https://leetcode.com/problems/average-of-levels-in-binary-tree/description/

private fun averageOfLevels(root: TreeNode?): DoubleArray {
    val res = average(root!!)
    println(res)
    return res.toDoubleArray()
}
private fun average(node: TreeNode):List<Double>{
    val queue = LinkedList<TreeNode>()

    queue.add(node)
    val arr = mutableListOf<TreeNode>()
    val res = mutableListOf<Double>()

    res.add((node.`val`).toDouble())

    while(queue.isNotEmpty()){

        val curr = queue.pop()

        //  println(curr.`val`)
        if (curr.left != null){
            arr.add(curr.left!!)
            //  queue.add(curr.left)
        }
        val s = 'a'
        
        if (curr.right != null){
            arr.add(curr.right!!)
            // queue.add(curr.right)
        }
        if ((queue.isEmpty())&&(arr.isNotEmpty())){
            queue.addAll(arr)
            var sum = 0L
            arr.forEach{
                sum+=it.`val`
            }
            res.add((sum/arr.size.toDouble()))
            arr.clear()
        }

    }

    return res
}