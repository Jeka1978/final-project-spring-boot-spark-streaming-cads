package scala_and_spring.validators

/**
  * @author Evgeny Borisov
  */
trait PersonValidator {
  def validate(person: Person):Option[String]

}
