package Intro

object sumFunc extends App {
    def sum(f: Int => Int)(a: Int)(b: Int): Int = {
        @annotation.tailrec
        def loop(n: Int, acc: Int): Int = {
            if (n > b) {
                println(s"n=${n}, acc=${acc}")
                acc
            } else {
                println(s"n=${n}, acc=${acc}")
                loop(n + 1, acc + f(n))
            }
        }
        loop(a, 0)
    }
    println(sum(x => x * x)(1)(5))

    val sumSquare = sum(x => x * x)_
    println(sumSquare(1)(5))
}
