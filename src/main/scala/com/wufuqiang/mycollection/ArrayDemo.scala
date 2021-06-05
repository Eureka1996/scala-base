package com.wufuqiang.mycollection

import scala.collection.mutable
import scala.collection.mutable.ArrayBuffer

/**
 * @author: Wu Fuqiang
 * @create: 2021-06-04 08:55
 *
 */
object ArrayDemo extends App {

  val arr:Array[Int] = new Array[Int](10)
  println(arr.length)
  println("-"*20)
  println(arr(1))
  println("-"*20)
  for(i <- arr){
    println(i)
  }
  println("-"*20)
  arr(1) = 111
  for(i <- arr){
    println(i)
  }
  println("-"*20)
  var arr2 = Array(1,2,"wufuqiang")
  for(i <- arr2){
    println(i)
  }
  println("-"*20)
  for(i <- 0 until arr2.length){
    println(arr2(i))
  }
  println("-"*20)
  var arr3 = new ArrayBuffer[Int]()
  arr3.append(1)
  arr3.append(6)
  for(i <- arr3) println(i)

  println("-"*20)
  arr3(1) = 7
  arr3.append(8,9)
  arr3.remove(2) //删除某个下标的值
  for(i <- arr3) println(i)

  //定长转变长
  private val arrBuffer1: mutable.Buffer[Int] = arr.toBuffer
  //变长转定长
  private val arr4: Array[Int] = arr3.toArray

  //多维数组
  private val array: Array[Array[Int]] = Array.ofDim[Int](2, 3)
  array(0)(2) = 123
  array(1)(1) = 123

  for(i <- array){
    for(j <- i){
      print(s"${j}\t")
    }
    println()
  }



}

