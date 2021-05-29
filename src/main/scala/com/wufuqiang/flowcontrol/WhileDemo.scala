package com.wufuqiang.flowcontrol

/**
 * @author: Wu Fuqiang
 * @create: 2021-05-29 15:24
 *
 */
object WhileDemo {
  def main(args: Array[String]): Unit = {
    var i = 0
    while (i < 10){
      println(s"hellworld,i=$i")
      i+=1;
    }
    var j = 0
    do{
      println(s"i=$j")
      j+=1;
    }while(j < 10)
  }

}
