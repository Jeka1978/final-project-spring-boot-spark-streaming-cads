package scala_and_spring.validators

import org.springframework.context.annotation.AnnotationConfigApplicationContext

/**
  * @author Evgeny Borisov
  */
object Main {
  def main(args: Array[String]): Unit = {

    val context = new AnnotationConfigApplicationContext("scala_and_spring.validators")
    val mainValidator = context.getBean(classOf[MainValidator])
    val person = Person(age = 10, name = "Anatoliy")
    mainValidator.printAllErrors(person)

  }
}
