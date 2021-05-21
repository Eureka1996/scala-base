package com.wufuqiang.trans

import scala.collection.mutable
import scala.collection.mutable.ArrayBuffer

object ArrayBuffer2List {
  def main(args: Array[String]): Unit = {
    val arr = ArrayBuffer("1","2","3")
    val javaArr = transArrayBuffer2List(arr)
    javaArr.add("wufuqiang")
    println(javaArr)


    val value: mutable.Buffer[String] = transList2ArrayBuffer(javaArr)
    value.append("wufq")

    value.foreach(println)

  }

  //Scala ArrayBuffer转Java List
  def transArrayBuffer2List(ab:ArrayBuffer[String]): java.util.List[String] ={
    import scala.collection.JavaConversions.bufferAsJavaList
    val javaArr = new ProcessBuilder(ab)
    val javaList = javaArr.command()
    javaList
  }

  def transList2ArrayBuffer(list:java.util.List[String]): mutable.Buffer[String] ={
    import scala.collection.JavaConversions.asScalaBuffer
    val scalaArr:mutable.Buffer[String] = list
    scalaArr
  }
}
