package Intro

object curriedFunc extends App {
    def add(x: Int, y: Int) = x + y

    def curriedAdd(x: Int)(y: Int) = x + y

    println(curriedAdd(2)(2))

    val addOne = curriedAdd(1)_
    println(addOne(2))
}
