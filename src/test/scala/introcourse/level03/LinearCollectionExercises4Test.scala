package introcourse.level03

import introcourse.level03.LinearCollectionExercises4.{sumOf, takeDivisibleBy, fibList}
import org.scalactic.TypeCheckedTripleEquals
import org.scalatest.funspec.AnyFunSpec

class LinearCollectionExercises4Test extends AnyFunSpec with TypeCheckedTripleEquals {
  describe("lazy list - sum") {
    it("should return sum of x consecutive numbers") {
      val result = sumOf(10)
      assert(result === Range(0, 10).sum)
    }
  }

  describe("lazy list - takeDivisibleBy") {
    it("should return the first 'n' natural numbers divisible by 'x' ") {
      val divisible = 13
      val size = 5
      val result = takeDivisibleBy(size, divisible)

      assert(result === Range(1, 100).filter(_ % divisible == 0).take(size).toList)
    }
  }

  describe("lazy list - fibonacci") {
    it("should return the first 'n' fibonacci sequence ") {
      val result = fibList(10)
      assert(result === List(0, 1, 1, 2, 3, 5, 8, 13, 21, 34))
    }
  }

}
