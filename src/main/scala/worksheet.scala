package Intro

object worksheet extends App {
    val l = List("alice", "bob", "cathy")

    for (
        s <- l //generator
    ) println(s)

    for {
        s <- l
        if (s.length > 3) //filter
    } println(s)

    val result_for = for {
        s <- l
        s1 = s.toUpperCase() //variable binding
        if (s1 != "")
    } yield (s1)
    println(result_for)
}
