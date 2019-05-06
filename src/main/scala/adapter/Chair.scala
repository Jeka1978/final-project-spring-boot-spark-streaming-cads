package adapter

/**
  * @author Evgeny Borisov
  */
case class Chair() extends Costable {
  override def cost(): Double = 5
}
