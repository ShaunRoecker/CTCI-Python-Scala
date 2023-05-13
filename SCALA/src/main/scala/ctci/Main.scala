package ctci

import ctci.chapter1.OneAway._
import ctci.chapter1.StringCompression._

@main
def main = 
    println("CTCI")
    println(oneAway1("ple", "pale"))  //true
    println(oneAway1("pales", "pale")) //true
    println(oneAway1("pale", "bale")) //true
    println(oneAway1("pale", "bae")) //false
    println(stringCompression("aabcccccaaa"))
    println(stringCompression2("aabcccccaaa"))


