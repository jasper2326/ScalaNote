package Intro

object evaluationStrategy extends App {
    def test1(x: Int, y: Int): Int = x * x

    def test2(x: => Int, y: => Int): Int = x * x
}
