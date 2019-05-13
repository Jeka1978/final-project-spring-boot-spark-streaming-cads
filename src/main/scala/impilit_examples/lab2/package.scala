package impilit_examples

/**
  * @author Evgeny Borisov
  */
package object lab2 {

  trait Costable {
    def cost():Int
  }

  case class Chair(cost:Int,age:Int=12) extends Costable
  case class Table(cost:Int=50) extends Costable
  case class Car(cost:Int=20) extends Costable
  case class House(cost:Int=200) extends Costable


}
