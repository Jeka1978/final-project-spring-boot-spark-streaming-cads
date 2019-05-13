package impilit_examples.lab2

/**
  * @author Evgeny Borisov
  */
case class Costable2PricableAdapter(costable: Costable) extends Pricable {
  override def price(): Int = costable.cost()
}
