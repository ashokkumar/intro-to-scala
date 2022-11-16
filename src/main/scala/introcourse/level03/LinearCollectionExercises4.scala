package introcourse.level03

/**
  * These exercises will teach you how to work with the `LazyList` data structure in Scala.
  */
object LinearCollectionExercises4 {

  /**
    * A `LazyList` in Scala is a class that implements Seq.
    *
    * final classLazyList[+A]
    *
    * This class implements an immutable linked list. We call it "lazy" because it computes its elements only when they are needed.
    *
    * Elements are memoized; that is, the value of each element is computed at most once.
    *
    *
    * scala> LazyList.from(0)
    * > val res1: LazyList[Int] = LazyList(not computed)
    *
    */

  /**
    * scala> sumOf(5) // 0 + 1 + 2 + 3 + 4
    * > 10
    *
    * Hint: LazyList.from(0).take(5)
    */
  def sumOf(x: Int): Int = LazyList.from(0).take(x).sum

  /**
    * scala> takeDivisibleBy(2, 7)
    * > List(7, 14)
    *
    * Hint: User filter, take and toList
    */
  def takeDivisibleBy(size: Int, divisible: Int): List[Int] = LazyList.from(1).filter(_ % divisible == 0).take(size).toList

  /**
    * Return list of fibonacci numbers
    *
    * scala> fibList(5)
    * > List(0, 1, 1, 2, 3)
    *
    */
  def fibList(size: Int): List[Int] = {
    lazy val infiniteFibList:LazyList[Int] = 0 #:: 1 #:: infiniteFibList.zip(infiniteFibList.tail).map{ n => n._1 + n._2 }
    infiniteFibList.take(size).toList
  }

}
