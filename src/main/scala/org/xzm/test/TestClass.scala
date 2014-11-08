package org.xzm.test

import scala.reflect.BeanProperty
/**
 * redefine setter or getter function
 */
class TestClass{
  private var privateMem: Int = 186

  //complex version
  def getMem() = {
    privateMem
  }

  def setMem(one: Int)  ={
    //no longer young, can not return past
    if(one > privateMem) {privateMem = one}
  }

  //lite version
  //def getMem = privateMem
  //def setMem(one: Int)  {privateMem = one}
  //
  
  //ultimate version, mem and mem_ respectively are getter and setter function
  def mem = privateMem
  def mem_(one: Int){
    //no longer young, can not return past
    if(one > privateMem) {privateMem = one}
  }

  // other can access private variable mem, since other also is TestClass object
  def isLess(other: TestClass) = mem < other.mem

  //private[this] var privateMem: Int = 186
  //notes that the above define, other object can't access mem
  def isLess2(other: TestClass) = mem < other.mem
}

class UnderLine{
   @BeanProperty var m:String = _
}

class ThisConstruction{
  private var a=0
  println("begin to construct")
}

class Pig(name: String, age: Int){
  private var m = 3
  println(age)
  def f() {
    println(name)
  }
}

//outer is translatet to "public final org.xzm.Test.Big $outer;""
class Big {outer=>
  var v = 3
  class Small{
    def f() {println(outer.v)}
  }
}
object TestClass{
    def main(args: Array[String]){
        println("today is 20141103 05:04:59")
        val t = new TestClass
        println("ori value=" + t.getMem)

        t.setMem(199)
        println("new value=" + t.getMem)

        val n = new UnderLine
        n.setM("hello")
        println(n.getM)

        new ThisConstruction
    }
}