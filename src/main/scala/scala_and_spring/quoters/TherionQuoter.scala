package scala_and_spring.quoters

import org.springframework.stereotype.Component

/**
  * @author Evgeny Borisov
  */
@Component
class TherionQuoter extends Quoter {
  override def sayQuote(): Unit = println("I dring and I know things")
}
