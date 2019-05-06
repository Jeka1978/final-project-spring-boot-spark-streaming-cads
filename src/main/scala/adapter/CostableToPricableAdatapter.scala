package adapter

/**
  * @author Evgeny Borisov
  */
case class CostableToPricableAdatapter(costable: Costable) extends Pricable {
  override def price(): Double = {
    costable.cost()
  }
}
