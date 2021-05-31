package com.wufuqiang.mystring

/**
 * @author: Wu Fuqiang
 * @create: 2021-05-28 13:29
 *
 */
object StringDemo {
  def main(args:Array[String]):Unit ={
    val str:String = "wufuqiang"
    println(str.take(0))
    println(str.take(1))
    println(str.take(-1))
    println(str.take(str.length))
    println(str.reverse.take(1))
    println(str.takeRight(1))
    println(str(0))
    println(str(1))


  }
}
