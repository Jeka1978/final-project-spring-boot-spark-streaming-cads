package com.iai.cads.finalprojectspringbootsparkstreaming.spark

import org.apache.spark.sql.{Dataset, Row, SparkSession}
import org.springframework.stereotype.Service

/**
  * @author Evgeny Borisov
  */
@Service
class ClientReaderService(spark: SparkSession) {
  def readClients(): Dataset[Row] ={
    spark.read.json("data/clients.json").as("clients")
  }

}
