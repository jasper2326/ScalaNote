package Intro

object tupleMap extends App {
    val tp1 = (1, 2)
    val tp2 = 1 -> 2
    val tp3 = (1, "Alice", "Math", 95.5)

    println(tp3._1)


    def sumSq(in: List[Int]): (Int, Int, Int) = {
        in.foldLeft((0, 0, 0))((t, v) => (t._1 + 1, t._2 + v, t._3 + v * v))
    }
    val a = List(1, 2, 3)
    println(a)
    println(sumSq(a))


    val p = Map(1 -> "David", 9 -> "Elwood")
    println(p)
    println(p(1))
    println(p.contains(1))
    println(p.keys)
    println(p.values)


    val p2 = p + (8 -> "Archer")
    println(p2)
    val p3 = p - 1
    println(p3)
    val p4 = p ++ List(2 -> "Alice", 5 -> "Bob")
    println(p4)
    val p5 = p -- List(1, 9, 2)
    println(p5)
}
