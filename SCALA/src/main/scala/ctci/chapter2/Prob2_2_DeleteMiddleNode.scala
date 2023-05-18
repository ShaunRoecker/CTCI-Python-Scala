package ctci.chapter2
 
 /**
 * Definition for singly-linked list.
 * class ListNode(_x: Int = 0, _next: ListNode = null) {
 *   var next: ListNode = _next
 *   var x: Int = _x
 * }
 */

object RemoveNthFromEnd {
    def toList(h: ListNode,i: Int): List[(Int,Int)] = h match {
      case x if x == null => Nil
      case n if n != null => (i,n._x) :: toList(n.next,i+1)
    }
  
    def toListNode(l: List[(Int,Int)], n:Int, x:Int) : ListNode = l match {
      case Nil => null
      case h::t if h._1 != (x - n) => {
        var node = new ListNode(h._2)
        node.next = toListNode(t,n,x)
        node
      }
      case h::t if h._1 == x - n => toListNode(t,n,x)
    }
  
    def removeNthFromEnd(head: ListNode, n: Int): ListNode = {
       val l = toList(head,0) 
       toListNode(l,n,l.length) 
    }
}