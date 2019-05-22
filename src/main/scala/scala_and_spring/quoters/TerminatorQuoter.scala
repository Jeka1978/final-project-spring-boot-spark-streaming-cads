package scala_and_spring.quoters

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

/**
  * @author Evgeny Borisov
  */
@Component
class TerminatorQuoter extends Quoter {
  @Autowired
  val helper: QuoterHelper = new QuoterHelper

  override def sayQuote(): Unit = println(helper.upper("I'll be back"))
}
