package impilit_examples.lab2

import org.reflections.Reflections

import scala.collection.JavaConversions._

/**
  * @author Evgeny Borisov
  */
object ProductFactory {
  //  val costableClasses: List[Class[_ <: Costable]] = List(classOf[Chair],classOf[Table],classOf[Table],classOf[Table])

  private val scanner = new Reflections("impilit_examples")

  private val costableClasses: List[Class[_ <: Costable]] = getAllCostableClasses

  private def getAllCostableClasses: List[Class[_ <: Costable]] = {
    scanner.getSubTypesOf(classOf[Costable]).toList
  }


  def generateProducts(amount: Int): List[Costable] = {
    (1 to amount).map(_ => generateProduct()).toList
  }


  def generateProduct(): Costable = {
    import RegistryAdditionalListMethods._
    costableClasses.getRandomItem().getConstructor(classOf[Int]).newInstance(new Integer(12))
  }

  def main(args: Array[String]): Unit = {
    (1 to 10).foreach(_ => println(generateProduct()))

  }


}









