package ctci

import ctci.chapter1.OneAway._
import ctci.chapter1.StringCompression._
import ctci.chapter1.RotateMatrix._
import ctci.chapter1.ZeroMatrix._
import ctci.chapter1.StringRotation._




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
    println(matrix.length) // 3
    rotateMatrix(matrix)
    println(matrix.flatten.toList)

    println(stringCompression3("aabcccccaaa"))
    println(compress("aabcccccaaa".toCharArray))
    println(compress2("aabcccccaaa".toCharArray))

    val matrix2 = Array(Array(1, 1, 1), Array(2, 0, 2), Array(3, 3, 3))
    setZeroes(matrix2)
    println(matrix2.flatten.toList)  // just to see it
    // Array(Array(1, 0, 1), Array(0, 0, 0), Array(3, 0, 3))

    println(stringRotation("waterbottle", "ttlewaterbo")) // true
    println(stringRotation("waterbottle", "ttlewaterba")) // false

    




