package org.xzm.test

trait log{
  val s: Int
  def f()
}

abstract class logger extends log{
   //val s: Int
  //def f(){
  //  println("in logger")
  //}
}

object TestTrait{
  def main(args: Array[String]){
    //val l = new logger
    //l.f
  }
}
