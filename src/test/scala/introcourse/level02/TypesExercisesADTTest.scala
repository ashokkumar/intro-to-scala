package introcourse.level02

import introcourse.level02.TypesExercisesADT._
import org.scalactic.TypeCheckedTripleEquals
import org.scalatest.funspec.AnyFunSpec

class TypesExercisesADTTest extends AnyFunSpec with TypeCheckedTripleEquals {
  describe("Command ADT") {
    it("Should move by given meters") {
      val result = move(Command(Some(10), None))
      assert(result === Some("Move by 10 meters"))
    }

    it("Should rotate by given degree") {
      val result = move(Command(None, Some(45)))
      assert(result === Some("Rotate by 45 degree"))
    }

    it("Should return invalid as not able to figure whether move or rotate - None") {
      val result = move(Command(Some(10), Some(45)))
      assert(result === None)
    }

    it("Should return invalid as there is no move or rotate - None") {
      val result = move(Command(None, None))
      assert(result === None)
    }
  }
  describe("Command Sum ADT") {
    it("Should move by given meters") {
      val result = move(Move(10))
      assert(result === "Move by 10 meters")
    }

    it("Should rotate by given degree") {
      val result = move(Rotate(45))
      assert(result === "Rotate by 45 degree")
    }

    it("Should return invalid as not able to figure whether move or rotate - None") {
      val result = move(Stop)
      assert(result === "Stopped")
    }
  }
}