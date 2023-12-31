package easy

//https://leetcode.com/problems/find-champion-i/description/

private fun findChampion(grid: Array<IntArray>): Int {
    for (i in 0 .. grid.lastIndex){
        for(j in 0 .. grid.lastIndex){
            if ((i!=j)&&((grid[i][j]!=1))){
                break
            }
            if (j == grid.lastIndex){
                return i
            }
        }
    }
    return -1
}