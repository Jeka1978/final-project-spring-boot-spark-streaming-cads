package scala_and_spring.validators

import org.springframework.stereotype.Component

/**
  * @author Evgeny Borisov
  */
@Component
class NameValidator extends PersonValidator {
  override def validate(person: Person): Option[String] = {

    person.name match {
      case null => Some("name can't be null")
      case "" => Some("name can't be empty")
      case x: String if x.length < 5 => Some("name is too short")
      case _ => None
    }

  }
}
