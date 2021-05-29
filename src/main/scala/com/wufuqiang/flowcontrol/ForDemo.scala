package com.wufuqiang.flowcontrol

/**
 * @author: Wu Fuqiang
 * @create: 2021-05-28 22:18
 *
 */
object ForDemo {
  def main(args: Array[String]): Unit = {
    for(i <- 1 to 5){  //输出[1,5]
      print(i+" ")
    }
    println()
    var list = List("wu","fu","qiang")
    for(l <- list){
      println(l)
    }

    for( i <- 1 until 5){
      println(i)
    }
    println("wu" * 5)
    //循环守卫
    //满足if语句的才进入循环体
    for( i <- 1 to 10 if i != 2){
      println(i)
    }

    //引入变量
    for( i <- 1 to 5;j = 5-i){
      println(s"i=$i,j=$j")
    }

    //嵌套循环
    for(i <- 1 to 5 ; j <- 1 to 5){
      println(s"i=$i,j=$j")
    }

    //循环返回值，将遍历过程中处理的结果返回到一个新Vector集合中，使用yield关键字
    val res =
      for( i <- 1 to 5 if i%2 == 0) yield i

    println(res)

    val res1 = for(i <- 1 to 10) yield {
      if(i % 2 == 0){
        i*2
      }else{
        i*i
      }
    }
    println(res1)

    println("循环条件{}")
    for{
      i <- 1 to 5
      j = 5 - i
    }{
      println(s"i=$i,j=$j")
    }

    println("循环步长")
    for(i <- Range(1,11,2)){ //range的循环[1,11)
      println(s"i=$i")
    }
    for(i <-  1 to 10 if (i & 1 )== 1){
      println(s"i=$i")
    }

  }
}
