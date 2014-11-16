package org.xzm.test

trait Logger {
  def log(msg: String) {}
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

object TestTrait {
  def main(args: Array[String]) {
    val a = new LogTest
    a.withdraw("123")
  }
}
