package easy.binary_trees

//https://leetcode.com/problems/search-in-a-binary-search-tree/description/

private fun searchBST(root: TreeNode?, `val`: Int): TreeNode? {

    if (root == null) return null
    var current = root
    while (current!=null){
        if (`val`>current.`val`){
            current = current.right
        }else if(`val`<current.`val`){
            current = current.left
        }else{
            return current
        }
    }

    return null
}

fun main(){
    val s = "dd,dsw! ha,w   , aa"
s.lowercase()
    println(s.replace("""[$,.!?:]""".toRegex(), " ").trim())
}
