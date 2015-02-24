package org.deepdive.settings

case class InferenceSettings(factors: List[FactorDesc], insertBatchSize: Option[Int], 
  skipLearning: Boolean = false, weightTable: String = "", parallelGrounding: Boolean = false,
  partitionColumn: Option[String] = None, numPartitions: Option[Int] = None)