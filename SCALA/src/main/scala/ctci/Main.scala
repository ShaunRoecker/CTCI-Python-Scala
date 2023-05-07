package ctci

import ctci.chapter1.IsUnique._


@main
def main = 
    println("CTCI Scala")

    println { Console.CYAN + "*" * 50 + "\n" + Console.RESET }
    println { Console.GREEN + "CHAPTER 1" + Console.RESET }

    println(isUnique3("hasdups")) // false
    println(isUnique3("nodups")) // true

    println(isUnique4("hasdups")) // false
    println(isUnique4("nodups")) // true




