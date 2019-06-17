package com.iai.cads.finalprojectspringbootsparkstreaming.spark

import org.apache.spark.sql.SparkSession
import org.springframework.context.annotation.{Bean, Configuration}

/**
  * @author Evgeny Borisov
  */
@Configuration
class Conf {
  @Bean
  def sparkSession():SparkSession={
    SparkSession.builder()
      .master("local[*]")
      .appName("cashbox")
      .getOrCreate()
  }

}



