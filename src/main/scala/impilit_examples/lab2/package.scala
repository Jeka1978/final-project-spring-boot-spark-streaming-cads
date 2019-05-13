package impilit_examples.lab2

/**
  * @author Evgeny Borisov
  */

trait Costable {
  def cost(): Int
}

case class Chair(cost: Int) extends Costable

case class Table(cost: Int = 50) extends Costable

case class Car(cost: Int = 20) extends Costable

case class House(cost: Int = 200) extends Costable


