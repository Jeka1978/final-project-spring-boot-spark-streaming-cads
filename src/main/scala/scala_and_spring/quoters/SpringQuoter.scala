package scala_and_spring.quoters

import org.springframework.stereotype.Component

/**
  * @author Evgeny Borisov
  */
@Component
class SpringQuoter extends Quoter {
  override def sayQuote(): Unit = println("Spring is coming...")
}
