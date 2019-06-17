package spark_streaming

/**
  * @author Evgeny Borisov
  */
object ProductInfoProvider {


  val productMap: Map[Int, String] =Map(1->"Sword",2->"Shield",3->"Arrow",4->"Bow")


  def main(args: Array[String]): Unit = {
    val purchase = Purchase(product_id = 1,client_id = 2,cashbox_id = 4)
    println(purchase)
  }
}
