
import ctci.chapter1.OneAway._
import ctci.chapter1.StringCompression._
import ctci.chapter1.RotateMatrix._
import ctci.chapter1.ZeroMatrix._
import ctci.chapter1.StringRotation._
import ctci.chapter2.RemoveDups._
import ctci.chapter2.RemoveNthFromEnd._
import ctci.chapter2.ListNode
import algorithms.{Sorting, Searching}



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

    println(List(1,6,3,4,6,3,4,5,2,3,4).removeDups1)
    // List(1, 6, 3, 4, 5, 2)

    val listNode = ListNode(1, ListNode(2, ListNode(3, ListNode(4, ListNode(5)))))
    println(listNode)
    // ListNode(1,ListNode(2,ListNode(3,ListNode(4,ListNode(5,null)))))
    val p23 = removeNthFromEnd(listNode, 2)

    println(p23)

    Sorting.runSort()
    Searching.runSearch()
    
    




