package org.xzm.test

object TestRegex{
  def main(args: Array[String]){
    val s = "[0-9]+".r

    for(e <- s.findAllIn("1234324 543")){
      println(e)
    }

    val a = s.findAllIn("1234324 543").toArray
    println(a.mkString)
  }
}
