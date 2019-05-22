package spark_streaming

import org.apache.spark.SparkConf
import org.apache.spark.streaming.{Seconds, StreamingContext}


/**
  * @author Evgeny Borisov
  */
object DstreamEnrichmentMain {
  def main(args: Array[String]): Unit = {

    val productMap = ProductInfoProvider.productMap

    val conf = new SparkConf().setAppName("test").setMaster("local[*]")
    val ssc = new StreamingContext(conf, Seconds(1))
    val broadcastedMap = ssc.sparkContext.broadcast(productMap)

    val dStream = ssc.socketTextStream("localhost", 9999)


    dStream
      .map(Purchase.fromJson)
      .map(purchase=>purchase.copy(product_name = broadcastedMap.value.getOrElse(purchase.product_id,"Axe")))
      .print()

    ssc.start()
    ssc.awaitTermination()


  }

}
