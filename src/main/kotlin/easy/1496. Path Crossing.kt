package easy

//Given a string path, where path[i] = 'N', 'S', 'E' or 'W', each representing moving one unit north, south, east, or west, respectively. You start at the origin (0, 0) on a 2D plane and walk on the path specified by path.
//
//Return true if the path crosses itself at any point, that is, if at any time you are on a location you have previously visited. Return false otherwise.
//
//
//
//Example 1:
//
//
//Input: path = "NES"
//Output: false
//Explanation: Notice that the path doesn't cross any point more than once.
//Example 2:
//
//
//Input: path = "NESWW"
//Output: true
//Explanation: Notice that the path visits the origin twice.
//
//
//Constraints:
//
//1 <= path.length <= 104
//path[i] is either 'N', 'S', 'E', or 'W'.

fun main(){
    val path = "NESWW"
    println(isPathCrossing(path))
}

private fun isPathCrossing(path: String): Boolean {

    val set = hashSetOf<Coord>()
    set.add(Coord(0,0))
    var current = Coord(0,0)
    for(move in path){
        val nextCoord = current.copy()
        nextCoord.doMove(move)
        if (set.contains(nextCoord)) return true
        set.add(nextCoord)
        current = nextCoord
    }
    return false
}

private data class Coord(var x:Int, var y:Int){

    fun doMove(move: Char){
        when(move){
            'N'->this.y+=1
            'S'->this.y-=1
            'E'->this.x-=1
            'W'->this.x+=1
        }
    }
}