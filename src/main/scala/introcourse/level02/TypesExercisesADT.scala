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
  def move(command: Command): Option[String] = command match {
    case Command(Some(x), None) => Some(s"Move by $x meters")
    case Command(None, Some(x)) => Some(s"Rotate by $x degree")
    case _ => None
  }


  /**
    * Command as Sum Type ADT
    */
  sealed trait CommandSumType
  case class Move(x: Int) extends CommandSumType
  case class Rotate(x: Int) extends CommandSumType
  case object Stop extends CommandSumType
  /**
    *
    * Ref the test and use Move, Rotate and Stop and
    * implement move(sumTypeCommand: CommandSumType) function
    */
  def move(sumTypeCommand: CommandSumType): String = sumTypeCommand match {
    case Move(x) => s"Move by $x meters"
    case Rotate(x) => s"Rotate by $x degree"
    case Stop => "Stopped"
  }
}
