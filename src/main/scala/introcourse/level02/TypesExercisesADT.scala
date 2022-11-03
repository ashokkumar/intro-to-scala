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
    * Command as Sum Type ADT
    *
    * HINT:
    *   case class Move...
    *   case class Rotate...
    *   case object Stop...
    *
    */
  sealed trait CommandSumType
  /**
    *
    * Refer the test fix it and use Move, Rotate and Stop to
    * implement move(sumTypeCommand: CommandSumType) function
    */
  def move(sumTypeCommand: CommandSumType): String = ???
}
