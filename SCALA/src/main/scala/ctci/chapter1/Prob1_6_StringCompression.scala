package ctci.chapter1

// Write a method that compresses a string "aabcccccaaa" to "a2b1c5a3" if the compressed
// string is shorter than the input string, or else return the input string.


object StringCompression:
    def stringCompression(s: String): String =
        @annotation.tailrec
        def go(s: String, acc: List[(Char, Int)]): List[(Char, Int)] =
            s match
                case x if x.isEmpty => acc
                case x if acc.isEmpty || x.head != acc.head._1 => go(s.tail, (s.head, 1) :: acc)
                case _ => go(s.tail, (acc.head._1, acc.head._2 + 1) :: acc)
        go(s, List()).reverse.map((c, n) => c.toString + n.toString).mkString

    
// println(stringCompression("aabcccccaaa"))
// a1a2b1c1c2c3c4c5a1a2a3

// TODO

    def stringCompression2(s: String) =
        val xs = s.toList
        if (xs.isEmpty) s
        else
            xs.tail.scanLeft(xs.head -> 1) { case ((prev, count), curr) =>
                val nextCount = 
                    if (prev == curr) count + 1
                    else 1
                curr -> nextCount
            }


// println(stringCompression2("aabcccccaaa"))
// List((a,1), (a,2), (b,1), (c,1), (c,2), (c,3), (c,4), (c,5), (a,1), (a,2), (a,3))
// Need to figure out how to finish these
    

