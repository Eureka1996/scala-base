package com.wufuqiang.myexception

//Scala没有编译期异常，异常都是在运行的时候捕获处理的
object TryCatchDemo {
  def main(args: Array[String]): Unit = {
    test1
  }

  def test1: Unit ={
    try{
      val r = 10 /0
    }catch{
      case ex:ArithmeticException => {
        println("捕获了")
        println("捕获了除数为0的算数异常。")
      }
      case ex:Exception => println("捕获所有异常")

    }finally {
      println("scala finally.")
    }
  }

}
