package scala_and_spring.quoters

import org.springframework.context.annotation.AnnotationConfigApplicationContext

/**
  * @author Evgeny Borisov
  */
object Main {
  def main(args: Array[String]): Unit = {
    val context = new AnnotationConfigApplicationContext("scala_and_spring.quoters")
    val aggregator: QuoterAggregator = context.getBean(classOf[QuoterAggregator])
    aggregator.sayAllQuotes()

  }

}
