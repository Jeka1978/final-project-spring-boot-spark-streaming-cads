package spark_streaming

import org.apache.spark.SparkConf
import org.apache.spark.streaming.{Seconds, StreamingContext}
import org.codehaus.jackson.map.ObjectMapper


/**
  * @author Evgeny Borisov
  */
object DstreamEnrichmentMain {
  def main(args: Array[String]): Unit = {
  /*  val conf = new SparkConf().setAppName("test").setMaster("local[*]")
    val ssc = new StreamingContext(conf,Seconds(10))
    val dStream = ssc.socketTextStream("localhost",9999)*/

    val json = "{ \"client_id\": 9, \"cashbox_id\": 3, \"product_id\": 2}"
    val mapper = new ObjectMapper()
    val purchase = mapper.readValue(json,classOf[Purchase])
    println(purchase)

  }

}
