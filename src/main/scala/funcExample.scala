package Intro

object funcExample extends App {
    def hello(name: String): String = {
        s"Hello, ${name}"
    }
    println(hello("JHZ"))


    def hello2(name: String) = {
        s"Hello, ${name}"
    }
    println(hello2("ZFC"))


    def add(x:Int, y:Int) = x + y
    println(add(1, 2))
}
