package impilit_examples.lab2

import java.util

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





  def generateProduct():Costable={
    import RegistryAdditionalListMethods._
    costableClasses.getRandomItem().getConstructor(classOf[Int]).newInstance(new Integer(12))
  }

  def main(args: Array[String]): Unit = {
    println(generateProduct())
    println(generateProduct())
    println(generateProduct())
    println(generateProduct())
    println(generateProduct())

  }

















}









