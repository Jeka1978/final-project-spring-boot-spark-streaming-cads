package com.iai.cads.finalprojectspringbootsparkstreaming.spark

import com.iai.cads.finalprojectspringbootsparkstreaming.dao.ProductumDao
import com.iai.cads.finalprojectspringbootsparkstreaming.model.Productum
import com.iai.cads.finalprojectspringbootsparkstreaming.services.ProductumService
import org.apache.spark.sql.expressions.UserDefinedFunction
import org.apache.spark.sql.functions
import org.springframework.stereotype.Service
import scala.collection.JavaConverters._

/**
  * @author Evgeny Borisov
  */
@Service
class ProductumEnrichmentator(@transient productumDao: ProductumDao,@transient productumService: ProductumService) extends Serializable {

  productumService.fillDB()
  private val productMap: Map[Integer, Productum] =
    productumDao.findAll()
      .asScala
      .map(p=>(p.getId,p)).toMap



  def getProductName(id:Int):String={
      productMap(id).getName
  }

  def productNameUdf:UserDefinedFunction = functions.udf[String,Int](getProductName)


}
