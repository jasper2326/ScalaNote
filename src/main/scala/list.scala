package Intro

object list extends App {
    val a = List(1, 2, 3, 4)
    val b = 0 :: a

    val c = "x" :: "y" :: "z" :: Nil

    val d = a ::: c


    a.head
    d.head
    a.tail
    a.isEmpty


    def walkThrough(l: List[Int]): String = {
        if (l.isEmpty) ""
        else l.head.toString + " " + walkThrough(l.tail)
    }
    println(walkThrough(a))


    a.filter(x => x % 2 == 1)
    "99 Red Balloons".toList
    "99 Red Balloons".toList.filter(x => Character.isDigit(x))
    "99 Red Balloons".toList.takeWhile(x => x != 'B')


    c.map(x => x.toUpperCase)
    c.map(_.toUpperCase)
    a.filter(_ % 2 == 1)
    a.filter(_ % 2 == 1).map(_ + 10)


    val q = List(a, List(4, 5, 6))
    q.map(x => x.filter(_ % 2 == 0))
    q.map(_.filter(_ % 2 == 0))
    q.flatMap(_.filter(_ % 2 == 0))
}
