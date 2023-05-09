package ctci

import ctci.chapter1.IsUnique._
import ctci.chapter1.CheckPermutation._



@main
def main = 
    println("CTCI Scala")

    println { Console.CYAN + "*" * 50 + "\n" + Console.RESET }
    println { Console.GREEN + "CHAPTER 1" + Console.RESET }

    println(isUnique3("hasdups")) // false
    println(isUnique3("nodups")) // true

    println(isUnique4("hasdups")) // false
    println(isUnique4("nodups")) // true

    println(checkPermutation1("dog", "God")) //false
    println(checkPermutation1("dog", "god")) //true

    println(checkPermutation2("doghaha", "Godhaha")) //false
    println(checkPermutation2("doghaha", "godhaha")) //true

    println(List("aa", "bbb", "bb", "bbb").groupBy(_.length))
    // HashMap(2 -> List(aa, bb), 3 -> List(bbb, bbb))

    println("aabaccdcdab".groupBy(identity))
    // Map(a -> aaaa, b -> bb, c -> ccc, d -> dd)  ---> Map[Char, String]
    // Map('a' -> "aaaa", 'b' -> "bb", 'c' -> "ccc", 'd' -> "dd")  
    println("aabaccdcdab".groupBy(identity).transform((k, v) => v.size))
    // Map(a -> 4, b -> 2, c -> 3, d -> 2)

    // transform can replace mapValues from older Scala versions, however
    // it's better because it can also use the key 'value' in the logic to 
    // evaluate the value
        // Map.transform((key, value) => if (key == 'x') value + 1 else value + 2)

    

//



//