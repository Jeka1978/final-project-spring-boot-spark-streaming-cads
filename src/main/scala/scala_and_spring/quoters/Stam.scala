package scala_and_spring.quoters

/**
  * @author Evgeny Borisov
  */
object Stam {
  def apply(myFunc: Int => String, x: Int): Unit = println(myFunc(x))

  def buildString(x:Int):String=x.toString

  def main(args: Array[String]): Unit = {
    apply(buildString,1)
  }
}
