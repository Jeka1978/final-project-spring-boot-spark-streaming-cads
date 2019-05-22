package scala_and_spring.validators

import org.springframework.stereotype.Service

import scala.collection.JavaConversions._

/**
  * @author Evgeny Borisov
  */
@Service
class MainValidator(val validators: java.util.List[PersonValidator]) {

  def printAllErrors(person: Person): Unit = {
//    val str = validators.map(_.validate(person)).map(_.getOrElse("")).reduce(_ + ", " + _)
//
        val str: Option[String] = validators.flatMap(_.validate(person)).reduceOption(_ + ", " + _)


    println(str.getOrElse("OK"))
  }

}
