

package org.etl.command

import org.etl.util.ParameterisationEngine

class TryContext(var config: Map[String, String], val instanceName: String) extends Context {

  def getValue(variable: String): String = {
      ParameterisationEngine.resolve(variable, this)
  }

  def getMe(): java.util.Map[String, String] = {
    val configMap: java.util.Map[String, String] = new java.util.HashMap[String, String]
    config.foreach(t => {
      configMap.put(t._1, t._2)
    })
    configMap
  }

  def getMeAsIs(): Map[String, String] = {
    config
  }

  def addValue(key: String, value: String): Unit = {
    config += ((key, value))
  }
}