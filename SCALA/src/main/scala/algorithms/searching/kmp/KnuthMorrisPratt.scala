package algorithms.searching.kmp



object KMPSubstringSearch:
    extension(text: String)
        def kMPSubstringSearch(pattern: String): Int =
            val prefixTable = Vector(0,0,1,1,2,0,0,0,1)
            text.indices.foldLeft(-1, 0) { 
                case ((foundI, m), i) if foundI > 0 => (foundI, 0)
                case ((foundI, m), i) =>
                    val stepsM = Stream.iterate(m)(m => prefixTable(m - 1))
                    val lowerM = stepsM.find(m => m == 0 || pattern(m) == text(i)).get
                    val newM = if (pattern(lowerM) == text(i)) lowerM + 1 else lowerM
                    if (newM == pattern.length) (i - newM + 1, 0) 
                    else (-1, newM)
            }._1
