package ctci.chapter1

// Given an NxN matrix, rotate by 90degress
object RotateMatrix:

    def rotateMatrix[A](matrix: Array[Array[A]]): Boolean =
        @annotation.tailrec
        def rotate(shift: Int): Unit = 
            val size = matrix.length - (2 * shift)
            if(size > 1) {
                val start = shift
                val end = shift + size - 1
                
                for(i <- 0 until size - 1) {
                    val tmp1 = matrix(start)(start + i)
                    val tmp2 = matrix(start + i)(end)
                    val tmp3 = matrix(end)(end - i)
                    val tmp4 = matrix(end  - i)(start)

                    matrix(start + i)(end) = tmp1
                    matrix(end)(end - i) = tmp2
                    matrix(end  - i)(start) = tmp3
                    matrix(start)(start + i) = tmp4
                }
                rotate(shift + 1)
            }
        
        if (matrix.length == 0 || matrix.length != matrix(0).length) false
        else rotate(0); true




  




