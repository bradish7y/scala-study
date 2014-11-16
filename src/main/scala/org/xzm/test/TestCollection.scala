package org.xzm.test

import scala.collection.mutable
object TestCollection{
  def main(args: Array[String]){
    val m = Map[String, String]("taobao"->"www.taobao.com", "baidu"->"www.baidu.com")
    val iter = m.iterator
    for((key, value) <- m){
      println(key + "->" + value)
    }

    val ary = Array[String]("123")

    ary(0) = "888"

    for(it <- ary){
      println(it)
    }
  }
}
