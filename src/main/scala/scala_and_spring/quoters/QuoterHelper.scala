package scala_and_spring.quoters

import org.springframework.stereotype.Component

/**
  * @author Evgeny Borisov
  */
@Component
class QuoterHelper {
  def upper(string: String):String=string.toUpperCase

}
