package com.wufuqiang.mycollection

import scala.collection.mutable.ListBuffer

/**
 * @author: Wu Fuqiang
 * @create: 2021-06-04 18:48
 *
 */
object ArrayBufferDemo {
  def main(args: Array[String]): Unit = {
    val arrBuffer1 = new ListBuffer[Int]()
    arrBuffer1.append(4)
    arrBuffer1.append(4)
    arrBuffer1.append(4)
    println(arrBuffer1(0))
    println("-"*20)
    val arrBuffer2 = ListBuffer(1,2,3)
    for(item <- arrBuffer2){
      println(item)
    }

    arrBuffer2 += 2

    println("-"*20)
    for(item <- arrBuffer2){
      println(item)
    }
    println("-"*20)
    arrBuffer2++=arrBuffer1
    for(item <- arrBuffer2){
      println(item)
    }
    //arrBuffer2不变
    val arrBuffer3 = arrBuffer2 :+ 3


  }



}
