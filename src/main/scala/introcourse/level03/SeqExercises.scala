package introcourse.level03

/**
  * These exercises will teach you how to work with the `Set` data structure in Scala in a declarative manner.
  */
object SeqExercises {

  /**
    * A `Seq` in Scala is a trait equivalent of List in Java.
    *
    * trait Seq[+A] extends Iterable[A]
    *
    * List, Vector, Range, Queue, LazyList all extends Seq
    *
    * Seq is mostly used for interfaces
    */

  /**
    * scala> prepend(1, Seq(2, 3, 4))
    * > List(1,2,3,4)
    *
    * Hint: use +: and .toList
    */
  def prepend[A](x: A, xs: Seq[A]): List[A] = ???

  /**
    * scala> append(1, Seq(2, 3, 4))
    * > Vector(2,3,4,1)
    *
    * Hint: use :+ and .toVector
    */
  def append[A](x: A, xs: Seq[A]): Vector[A] = ???

  /**
    * scala> merge(List(1, 2), Vector(3, 4, 5))
    * > Seq(1, 2, 3, 4, 5)
    *
    * Hint: ++
    */

  def merge[A](xs: List[A], ys: Vector[A]): Seq[A] = ???
}
