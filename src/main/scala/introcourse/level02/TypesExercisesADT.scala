package introcourse.level02

/**
  * These exercises introduce data types and also algebraic data types (ADTs). ADTs are a huge part of typed functional programming.
  * You will also be introduced to a very useful technique for working with ADTs, i.e. pattern matching.
  */
object TypesExercisesADT {

  /**
    * *********************************
    * * Section 1 - Commant ************
    * *********************************
    */
  /**
    * A command class
    *
    * Command can either be move by x meters or rotate by x degree
    *
    * But can't be both move and rotate
    */
  case class Command(meters: Option[Int], degree: Option[Int])

  /**
    * Implement Command: Move
    *
    */
  def move(command: Command): Option[String] = ???


  /**
    * Now refactor the Command to a Sum Type ADT
    */


  /**
    * Implement function now
    */

  def simpleMove(sumTypeCommand: Command): String = ???
}
