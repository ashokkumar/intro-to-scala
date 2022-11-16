package introcourse.level03

import introcourse.level03.LinearCollectionExercises2.{prepend, fetch, isEmpty}
import org.scalactic.TypeCheckedTripleEquals
import org.scalatest.funspec.AnyFunSpec

class LinearCollectionExercises2Test extends AnyFunSpec with TypeCheckedTripleEquals {
  describe("vector") {
    it("should prepend given element") {
      val result = prepend(0, Vector(1, 2))
      assert(result === Vector(0, 1, 2))
    }

    it("should return the nth element") {
      val result = fetch(3, Vector(1, 2, 3, 4))
      assert(result == 4)
    }

    it("should return true for empty vector") {
      val result = isEmpty(Vector())
      assert(result)
    }

    it("should return false for non-empty vector") {
      val result = isEmpty(Vector(1, 2, 3, 4))
      assert(!result)
    }
  }
}
