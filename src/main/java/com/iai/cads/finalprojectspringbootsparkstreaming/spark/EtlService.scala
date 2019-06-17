package com.iai.cads.finalprojectspringbootsparkstreaming.spark

import org.apache.spark.sql.{SparkSession, functions}
import org.springframework.stereotype.Service

/**
  * @author Evgeny Borisov
  */
@Service
class EtlService(webSocketService: WebSocketService, clientReaderService: ClientReaderService, spark: SparkSession,productumEnrichmentator: ProductumEnrichmentator) {

  import spark.implicits._

  def startProcess(): Unit = {

    val purchasesDs = webSocketService.readPurchases()
    val clientsDf = clientReaderService.readClients()
    val joined = purchasesDs.join(clientsDf, $"client_id" === $"clients.id")

    val finalDf = joined.withColumn("product_name",productumEnrichmentator.productNameUdf($"id"))



    Distributor.write(finalDf)
  }

}
