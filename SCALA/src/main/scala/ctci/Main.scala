package ctci

import ctci.chapter1.OneAway._
import ctci.chapter1.StringCompression._
import ctci.chapter1.RotateMatrix._


@main
def main = 
    println("CTCI")
    println(oneAway1("ple", "pale"))  //true
    println(oneAway1("pales", "pale")) //true
    println(oneAway1("pale", "bale")) //true
    println(oneAway1("pale", "bae")) //false
    println(stringCompression("aabcccccaaa"))
    println(stringCompression2("aabcccccaaa"))
    
    val matrix = Array(Array(1, 1, 1), Array(2, 2, 2), Array(3, 3, 3))
    println(matrix.length)
    rotateMatrix(matrix)
    println(matrix.flatten.toList)



