package com.wufuqiang.func

import com.wufuqiang.entity.Calc

/**
 * @author: Wu Fuqiang
 * @create: 2021-05-29 18:35
 *
 */
object FuncBaseDemo {
  def main(args: Array[String]): Unit = {
    val calc:Calc = new Calc

    val func1 = calc.sum _

    println(func1)

    println(func1(12,32))

    //函数
    //n1、n2为输入
    val func2 = (n1:Int,n2:Int) => n1-n2

    println(func2)
    println(func2(34,21))

  }

}


