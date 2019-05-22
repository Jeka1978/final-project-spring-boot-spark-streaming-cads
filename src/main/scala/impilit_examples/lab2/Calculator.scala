package impilit_examples.lab2

/**
  * @author Evgeny Borisov
  */
object Calculator {

  def totalPrice(products:List[Pricable]):Int={
    products.map(_.price()).sum
  }

  def printPrice(pricable: Pricable):Unit={
    println(pricable.price())
  }

  def main(args: Array[String]): Unit = {
    import impilit_examples.lab2.ExtensionMethods._

    Calculator.printPrice(ProductFactory.generateProduct())
//    val products = ProductFactory.generateProducts(10)
//    println(Calculator.totalPrice(products))

  }
}







