package spark_streaming

import org.json4s.DefaultFormats
import org.json4s.jackson.Serialization.read

/**
  * @author Evgeny Borisov
  */
case class Purchase(product_id:Int,client_id:Int,cashbox_id:Int) {

}
object Purchase{
  implicit val formats: DefaultFormats.type = DefaultFormats
  def fromJson(json:String):Purchase={
    read[Purchase](json)
  }
}