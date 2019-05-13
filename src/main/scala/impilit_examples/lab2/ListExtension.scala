package impilit_examples.lab2

import scala.util.Random

/**
  * @author Evgeny Borisov
  */
class ListExtension[T](list: List[T]) {

 implicit def getRandomItem():T={
    list(Random.nextInt(list.size))
  }

}
