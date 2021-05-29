package com.wufuqiang.flowcontrol

/**
 * @author: Wu Fuqiang
 * @create: 2021-05-28 21:55
 *
 */
object IfElseDemo {
  def main(args: Array[String]): Unit = {
    val age = 19
    if(age > 18){
      println("成年了")
    }else if(age >= 10 && age <18){
      println("快要成年了")

    }else{
      println("还没成年")
    }

    val result1 =
      if(age > 20){
        "wufuqiang"
      }

    println(result1)
  }


}

