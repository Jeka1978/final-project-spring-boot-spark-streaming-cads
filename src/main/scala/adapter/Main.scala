package adapter

/**
  * @author Evgeny Borisov
  */
object Main {
  import AdapterMethods._

  def main(args: Array[String]): Unit = {
    val costable: Costable = ProductGenerator.generate()
    Calc.printPrice(costable)
  }
}
