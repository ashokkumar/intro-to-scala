package introcourse.level04

/**
  * Here we introduce a new ADT - `Option` - for dealing with values that may not exist.
  *
  * We will also cover safe constructors, which in conjunction with ADTs, allow us to prevent invalid states from being represented.
  */
object OptionExercises1 {

  /**
    * Option data type
    *
    * sealed trait Option[+A]
    * case class Some[A](a: A) extends Option[A]
    * case object None extends Option[Nothing]
    */

  /**
    * Safe constructors
    *
    * Allows us to convert input from the real world (e.g. files, HTTP request, etc.) into ADTs
    */

  /**
    * scala> mkTrafficLight("red")
    * > Some(Red)
    *
    * scala> mkTrafficLight("green")
    * > Some(Green)
    *
    * scala> mkTrafficLight("yellow")
    * > Some(Yellow)
    *
    * scala> mkTrafficLight("bob")
    * > None
    *
    * Hint: Use pattern matching
    **/
  def mkTrafficLight(str: String): Option[TrafficLight] = ???

  /**
    * scala> mkTrafficLightThenShow("red")
    * > "Traffic light is red"
    *
    * scala> mkTrafficLightThenShow("green")
    * > "Traffic light is green"
    *
    * scala> mkTrafficLightThenShow("yellow")
    * > "Traffic light is yellow"
    *
    * scala> mkTrafficLightThenShow("bob")
    * > "Traffic light bob is invalid"
    *
    * Hint: Use `mkTrafficLight` then pattern match.
    *
    * You can pattern match on `Option` using its two constructors `Some` and `None`:
    *
    * ```
    * maybeSomething match {
    *   case Some(a) => // do something with `a`
    *   case None => // do something else
    * }
    * ```
    */
  def mkTrafficLightThenShow(str: String): String = ???

  /**
    * scala> mkPerson("Bob", 20)
    * > Some(Person("Bob", 20))
    *
    * If `name` is blank:
    *
    * scala> mkPerson("", 20)
    * > None
    *
    * If `age` < 0:
    *
    * scala> mkPerson("Bob", -1)
    * > None
    *
    * Hint: Don't forget every if needs an else!
    **/
  def mkPerson(name: String, age: Int): Option[Person] = ???

  /**
    * scala> mkPersonThenChangeName("Bob", 20, "John")
    * > Some(Person("John", 20))
    *
    * scala> mkPersonThenChangeName("Bob", -1, "John")
    * > None
    *
    * scala> mkPersonThenChangeName("Bob", 20, "")
    * > None
    *
    * Hint: Use `mkPerson` and pattern matching
    **/
  def mkPersonThenChangeName(oldName: String, age: Int, newName: String): Option[Person] = {
    val maybePerson = mkPerson(oldName, age)
    ???
  }

  private def changeName(newName: String, person: Person): Person = person.copy(name = newName)

}
