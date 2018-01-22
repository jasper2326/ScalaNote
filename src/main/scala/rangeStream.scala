package Intro

object rangeStream extends App {
    println(1 to 10)
    println(1 to 10 by 2)
    println((1 to 10).toList)
    println(1 until 10)

    //Stream
    println(1 #:: 2 #:: 3 #:: Stream.empty)

    val stream = (1 to 10000000).toStream
    println(stream)
    println(stream.head)
    println(stream.tail)
}