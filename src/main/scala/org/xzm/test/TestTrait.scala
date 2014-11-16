package org.xzm.test

trait Logger {
  def log(msg: String)
  def info(msg: String) {
    log("info: " + msg)
  }

  def warn(msg: String) {
    log("warn: " + msg)
  }

  def error(msg: String) {
    log("error: " + msg)
  }
}

class LogTest extends Logger {
  def withdraw(msg: String) {
    info(msg)
  }

  override def log(msg: String) {
    println(msg)
  }
}

trait Logged{
  def log(msg: String){}
}

class BBC extends Logged{
  def p(msg: String){
    log(msg)
  }
}

trait ConsoleLogger extends Logged{
  val max: Int
  override def log(msg: String){
    println(msg+":"+max)
  }
}

case class Currency(value: Double, unit: String)

object Number{
  def unapply(num: String):Option[Int]={
    Some(Integer.parseInt(num))
  }
}

object TestTrait {
  def main(args: Array[String]) {
    val Number(n) = "99"
    println(n)
  }
}
