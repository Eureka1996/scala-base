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

    val d = test(sum, 23.32)
    println(d)

    val d1 = test(sum _, 11.11)
    println(d1)

    //把一个函数直接赋给一个变量，但是不执行函数
    val f1 = myPrint _

    val f2 = sum _



  }

  //test是一个高阶函数
  //f:Double => Double 表示一个函数，该函数可以接受一个Double，返回Double
  //n1:Double 普通参数
  //f(n1) 在test函数中，执行传入的函数
  def test(f:Double => Double,n1:Double)={
    f(n1)
  }

  //高阶函数，可以接受一个没有输入，返回为Unit的函数
  def test2(f:()=>Unit)={
    f()
  }

  def sum(n1:Double):Double={
    n1+n1
  }

  def myPrint():Unit={
    println("Hello World")
  }


}
