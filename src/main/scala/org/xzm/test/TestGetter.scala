package org.xzm.test

abstract class TTT
case class Toy(fisrt: String, second: String) extends TTT

//object Name {
//  def unapply(input: String) = {
//    val s = input.split(" ")
//    if (s.length < 2) None
//    else Some((s(0), s(1)))
//  }
//}

object Name {
  def unapplySeq(input: String) : Option[Seq[String]] = {
    if(input.trim == "") None else Some(input.trim.split(" "))
  }
}

object TestGetter {
  def main(args: Array[String]) {

    println("*" * 3)
  }
}
