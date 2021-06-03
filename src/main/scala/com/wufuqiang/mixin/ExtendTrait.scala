package com.wufuqiang.mixin

/**
 * @author: Wu Fuqiang
 * @create: 2021-06-03 01:02
 *
 */
object ExtendTrait extends App {

}

trait LoggedException extends Exception{
  def log():Unit={
    println(getMessage)   //方法来自于Exception
  }
}
