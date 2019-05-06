package impilit_examples

/**
  * @author Evgeny Borisov
  */
object Demo1 {
import ImplicitParams.israelTax
  def main(args: Array[String]): Unit = {
    printMaam
  }



  def printMaam(implicit maam: Double):Unit={
    println(maam)
  }







}
