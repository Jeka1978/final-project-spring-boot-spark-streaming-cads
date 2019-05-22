package spark_streaming

import org.apache.spark.SparkConf
import org.apache.spark.streaming.dstream.ReceiverInputDStream
import org.apache.spark.streaming.{Seconds, StreamingContext}

/**
  * @author Evgeny Borisov
  */
object DStreamMain {
  def main(args: Array[String]): Unit = {
    val conf = new SparkConf().setAppName("test").setMaster("local[*]")
    val ssc = new StreamingContext(conf,Seconds(10))
    val dStream = ssc.socketTextStream("localhost",9999)
    dStream.map(_.toUpperCase())
      .flatMap(_.split(" "))
      .map((_, 1))
      .reduceByKey(_+_)
      .print()

    ssc.start()
    ssc.awaitTermination()
  }
}
