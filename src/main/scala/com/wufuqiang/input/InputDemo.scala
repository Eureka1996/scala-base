package com.wufuqiang.input

import scala.io.StdIn

/**
 * @author: Wu Fuqiang
 * @create: 2021-05-28 21:38
 *
 */
object InputDemo {
  def main(args: Array[String]): Unit = {
    print("请输入姓名：")
    val name:String = StdIn.readLine();
    print("请输入薪水：")
    val salary:Double = StdIn.readDouble();
    println(name)
    println(salary)
  }
}
