package com.wufuqiang.flowcontrol

/**
 * @author: Wu Fuqiang
 * @create: 2021-05-29 15:43
 *
 */

import util.control.Breaks._

object BreakContinueDemo {
  def main(args: Array[String]): Unit = {
    var i = 0;
    breakable{   //breakable是一个高阶函数，可以接收函数的函数就是高阶函数
      while( i < 20){
        println(s"循环体$i")
        i+=1;
        if((i&1) == 1)
        if(i == 18) break()
      }
    }

    //用循环守卫实现continue

  }

}
