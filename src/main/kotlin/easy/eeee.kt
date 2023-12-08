package easy

import java.lang.StringBuilder

fun main(){
    val a = "aa"
    val goal = "a"
    println(rotateString(a,goal))
}
fun tesr(){
    val deque = ArrayDeque<Char>()
    deque.add('a')
    deque.add('b')
    println(deque)
    deque.removeFirst()
    println(deque)
}

fun rotateString(s: String, goal: String): Boolean {
    if (s.length!=goal.length) return false
    if (s==goal) return true
    val deque = ArrayDeque<Char>()
    val sArr = CharArray(goal.length)
    val goalArr = CharArray(goal.length)
    for (i in 0 .. goal.lastIndex){
        deque.add(s[i])
        sArr[i] = s[i]
        goalArr[i] = goal[i]
    }
    var j = 0

    var count = 0

    //    val a =    "b b b a c d d ceeb"
    //    val goal = "ceebbbbacdd"
    while((j<=goalArr.lastIndex)&&(count<goalArr.lastIndex*3)){
        var next = deque[j]
        if (next != goal[j]){
            next = deque.removeFirst()
            deque.add(next)
            count++
            j = 0
        }else{
            j++
        }
    }
    println("dequr = $deque")
    val str = StringBuilder()
    while (deque.isNotEmpty()){
        str.append(deque.removeFirst())
    }


    return str.toString() == goal
}