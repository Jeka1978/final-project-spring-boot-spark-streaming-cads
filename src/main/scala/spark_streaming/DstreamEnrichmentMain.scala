package spark_streaming

import org.apache.spark.SparkConf
import org.apache.spark.streaming.{Seconds, StreamingContext}


/**
  * @author Evgeny Borisov
  */
object DstreamEnrichmentMain {
  def main(args: Array[String]): Unit = {
    val conf = new SparkConf().setAppName("test").setMaster("local[*]")
    val ssc = new StreamingContext(conf, Seconds(1))
    val dStream = ssc.socketTextStream("localhost", 9999)
    dStream
      .map(Purchase.fromJson)
      .print()

    ssc.start()
    ssc.awaitTermination()


  }

}
