package org.xzm.test

class AA{

}

class BB{

}

class CC extends AA{

}

class Person(val name: String){

}
object TestInherit{
  def meet(p: Person{def toString: String}){
    println(p.toString)
  }
  def main(args: Array[String]): Unit = {
    val a = new AA
    val b = new BB
    val c = new CC
    if(b.isInstanceOf[AA]){
      println("1"+true)
    }

    if(c.isInstanceOf[AA]){
      println("2"+true)
    }

    if(c.getClass == classOf[CC]){
      println("3"+true)
    }

    val p = new Person("ronaldo"){
      override def toString() = "ronaldo"
    }

    println(p.toString)

    meet(p)
  }
}