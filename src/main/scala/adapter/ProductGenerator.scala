package adapter

import scala.util.Random

/**
  * @author Evgeny Borisov
  */
object ProductGenerator {
  val products = List(Chair(),Table())
  def generate():Costable={
    products(Random.nextInt(products.size))
  }
}
