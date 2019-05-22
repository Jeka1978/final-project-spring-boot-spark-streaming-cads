package scala_and_spring.validators

import org.springframework.stereotype.Component

/**
  * @author Evgeny Borisov
  */
@Component
class AgeValidator extends PersonValidator {
  override def validate(person: Person): Option[String] = {
    if (person.age < 0) Some("age can't be negative") else None
  }
}
