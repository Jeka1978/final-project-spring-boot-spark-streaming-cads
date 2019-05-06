package adapter

/**
  * @author Evgeny Borisov
  */
object Calc {

  def printPrice(pricable: Pricable): Unit =println(pricable.price())

}
