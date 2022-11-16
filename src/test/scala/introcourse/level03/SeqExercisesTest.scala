package introcourse.level03

import introcourse.level03.SeqExercises.{append, merge, prepend}
import org.scalactic.TypeCheckedTripleEquals
import org.scalatest.funspec.AnyFunSpec

class SeqExercisesTest extends AnyFunSpec with TypeCheckedTripleEquals {
  describe("seq") {

    it("should prepend given element") {
      val result = prepend(1, Seq(2, 3))
      assert(result === Seq(1, 2, 3))
    }

    it("should append given element") {
      val result = append(4, Seq(1, 2, 3))
      assert(result === Seq(1, 2, 3, 4))
    }

    it("should merge given list") {
      val result = merge(List(1, 2), Vector(3, 4))
      assert(result === Seq(1, 2, 3, 4))
    }
  }
}
