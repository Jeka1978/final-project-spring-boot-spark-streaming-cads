package adapter

/**
  * @author Evgeny Borisov
  */
case class Table() extends Costable {
  override def cost(): Double = 10
}
