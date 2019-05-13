package impilit_examples.lab2

/**
  * @author Evgeny Borisov
  */
object ExtensionMethods {

  implicit def convert(costable: Costable): Pricable = {
    Costable2PricableAdapter(costable)
  }
  implicit def convertList(list: List[Costable]):List[Pricable]={
    list.map(convert)
  }

}
