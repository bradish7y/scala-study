package org.xzm.test

import scala.io.Source
import java.io.FileOutputStream
import java.io.File
import java.io.FileInputStream
import scala.sys.process._

object TestIO {
  def main(args: Array[String]) {
    // scala io
    val source = Source.fromURL("http://www.baidu.com", "utf-8")
    val it = source.getLines
    if (it.hasNext)
      println(it.next())

    source.close()

    //scala io binary
    val f = new File("d:/scala.txt")
    val out = new FileOutputStream(f);
    out.write("123".getBytes())
    out.close()

    val file = new File("d:/scala.txt")
    val in = new FileInputStream(file)
    val buffer = new Array[Byte](file.length.toInt)
    in.read(buffer)
    println(buffer.map(_.toChar).foreach(print(_)))

    in.close()

  }
}
