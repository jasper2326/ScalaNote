package Intro

object reduceLeftFoldLeft extends App {
    val a = List(1, 2, 3, 4)
    println(a)

    println(a.reduceLeft((x, y) => x + y))
    println(a.reduce(_ + _))


    println(a.foldLeft(1)(_ + _))
}
