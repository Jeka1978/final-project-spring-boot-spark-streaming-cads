package adapter

/**
  * @author Evgeny Borisov
  */
object AdapterMethods {
   def asPricable(costable: Costable): Pricable ={
    CostableToPricableAdatapter(costable)
  }

}
