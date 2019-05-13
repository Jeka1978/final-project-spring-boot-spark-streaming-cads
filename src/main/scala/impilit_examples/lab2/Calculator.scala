package impilit_examples.lab2

/**
  * @author Evgeny Borisov
  */
object Calculator {

  def totalPrice(products:List[Pricable]):Int={
    products.map(_.price()).sum
  }

  def main(args: Array[String]): Unit = {
    import impilit_examples.lab2.ExtensionMethods._
    val products = ProductFactory.generateProducts(10)
    println(Calculator.totalPrice(products))
  }
}
