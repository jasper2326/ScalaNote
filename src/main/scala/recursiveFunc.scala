package Intro

object recursiveFunc extends App {
    def factorial(n: Int): Int = {
        if (n <= 0) 1
        else n * factorial(n - 1)
    }
    println(factorial(5))


    //Tail Recursive Function
    @annotation.tailrec
    def factorial2(n: Int, m: Int): Int = {
        if (n <= 0) m
        else factorial2(n - 1, m * n)
    }
    println(factorial2(5, 1))
}
