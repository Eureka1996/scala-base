package com.wufuqiang.myview

/**
 * @author: Wu Fuqiang
 * @create: 2021-06-06 19:39
 *
 */
object ViewDemo {
  def main(args: Array[String]): Unit = {
    val notView1 = (1 to 100).filter(item => item.toString.equals(item.toString.reverse))
    println(notView1)

    //使用view，并不会立即执行，而是在使用到时才执行
    val withView1 = (1 to 100).view.filter(item => item.toString.equals(item.toString.reverse))
    println(withView1)

    for(item <- withView1) println(item)
    println("-"*20)

    withView1.foreach(println)


  }

}
