package easy

import java.lang.Math.log
import kotlin.math.log

//Given a valid (IPv4) IP address, return a defanged version of that IP address.
//
//A defanged IP address replaces every period "." with "[.]".
//
//
//
//Example 1:
//
//Input: address = "1.1.1.1"
//Output: "1[.]1[.]1[.]1"
//Example 2:
//
//Input: address = "255.100.50.0"
//Output: "255[.]100[.]50[.]0"
//
//
//Constraints:
//
//The given address is a valid IPv4 address.

fun main(){
    val ip: String = "1.1.1.1"
    println(defangIPaddr(ip))
}

private fun defangIPaddr(address: String): String {
    return address.replace(".","[.]")
}