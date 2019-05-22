package scala_and_spring.quoters

import org.springframework.stereotype.Service
import scala.collection.JavaConversions._

/**
  * @author Evgeny Borisov
  */
@Service
class QuoterAggregator(val list: java.util.List[Quoter]) {
  def sayAllQuotes(): Unit = {
    println("quotes: ")
    list.foreach(_.sayQuote())
  }

}
