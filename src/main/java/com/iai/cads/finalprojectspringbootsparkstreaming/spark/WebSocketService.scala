package com.iai.cads.finalprojectspringbootsparkstreaming.spark

import org.apache.spark.sql.{DataFrame, Dataset, Encoders, SparkSession, functions}
import org.springframework.stereotype.Service
import spark_streaming.Purchase

/**
  * @author Evgeny Borisov
  */
@Service
class WebSocketService(spark: SparkSession) {
  import spark.implicits._

  def readPurchases(): Dataset[Purchase] = {
    spark.readStream.format("socket")
      .option("host", "localhost")
      .option("port", 9999)
      .load()
      .withColumn("json_data",functions.from_json($"value",Encoders.product[Purchase].schema))
      .select($"json_data.*")
      .as("purchase")
      .as[Purchase]

  }

}
