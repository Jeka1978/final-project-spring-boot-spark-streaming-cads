package impilit_examples.lab2

/**
  * @author Evgeny Borisov
  */
object ExtensionMethods {

  implicit class Costable2PricableAdapter(costable: Costable) extends Pricable {
    override def price(): Int = costable.cost()
  }

 /* implicit def convert(costable: Costable): Pricable = {
    Costable2PricableAdapter(costable)
  }
  implicit def convertList(list: List[Costable]):List[Pricable]={
    list.map(_=>convert(_))
  }*/

}
