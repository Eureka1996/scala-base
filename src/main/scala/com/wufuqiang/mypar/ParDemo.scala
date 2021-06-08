package com.wufuqiang.mypar

/**
 * @author: Wu Fuqiang
 * @create: 2021-06-06 20:04
 *
 */
object ParDemo {
  def main(args: Array[String]): Unit = {
    (1 to 10 ).foreach(println)
    println("-"*20)
    (1 to 20 ).par.foreach(println)

    val result1 = (1 to 100).map { case _ => Thread.currentThread().getName }.distinct
    println(result1)
    println("-"*20)
    val result2 = (1 to 100).par.map { case _ => Thread.currentThread().getName }.distinct
    println(result2)

  }
}
