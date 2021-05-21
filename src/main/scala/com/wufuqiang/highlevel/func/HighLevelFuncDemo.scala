package com.wufuqiang.highlevel.func
import scala.math._
object HighLevelFuncDemo {
  def main(args: Array[String]): Unit = {
    val num = 3.14
    val fun = ceil _
    val f:(Double) => Double = ceil

    println(fun(num))
    println(f(num))

    Array(1.23,2.67).map(fun).foreach(println)
  }
}
