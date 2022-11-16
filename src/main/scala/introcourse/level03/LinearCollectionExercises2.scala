package introcourse.level03

/**
  * These exercises will teach you how to work with the `Vector` data structure in Scala in a declarative manner.
  */
object LinearCollectionExercises2 {

  /**
    * A `Vector` in Scala is a abstract class that implements Seq.
    *
    * sealed abstract class Vector[+A]
    *
    * Vector is indexed and best suited for random access and update arbitrary elements at different location.
    * They are tree data structure, every node contains up to 32 elements of the vector or contains up to 32 other tree nodes.
    */

  /**
    * scala> prepend(1, Vector(2, 3, 4))
    * > Vector(1,2,3,4)
    *
    * Hint: same as Seq
    */
  def prepend[A](x: A, xs: Vector[A]): Vector[A] = x +: xs

  /**
    * scala> fetch(index: 1, Vector(1, 2, 3))
    * > 2
    *
    * Hint: Vector's apply method takes the index and returns the element.
    * Question: What happen if the given index is not in the Vector? What is the alternative to avoid exception?
    */
  def fetch[A](index: Int, xs: Vector[A]): A = xs(index)

  /**
    * scala> isEmpty(Vector(1,2))
    * > false
    * > isEmpty(Vector(1,2))
    * > true
    *
    * Hint: Use pattern matching
    * Seq(head, tail*) => Has 1 or more elements
    * Seq() => Empty
    */

  def isEmpty[A](xs: Vector[A]): Boolean = xs match {
      case Seq() => true
      case Seq(head, tail*) => false
    }
  }

