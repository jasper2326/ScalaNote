package Intro

object tryMatch extends App {
    val result_try = try {
        Integer.parseInt("dog")
    } catch {
        case _ => 0
    } finally {
        println("Always be printed")
    }
    println(result_try)


    val code = 3
    val result_match = code match {
        case 1 => "one"
        case 2 => "two"
        case _ => "other"
    }
    println(result_match)
}
