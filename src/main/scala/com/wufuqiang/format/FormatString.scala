package com.wufuqiang.format

/**
 * @author: Wu Fuqiang
 * @create: 2021-05-21 20:08
 *
 */
object FormatString {
  def main(args: Array[String]): Unit = {
    val lastName:String = "Wu"
    val name:String = s"$lastName Fuqiang"
    val age:Int = 25
    val info:String = s"name:$name,age:$age" //.format(name,age)
    println(info)
  }
}

