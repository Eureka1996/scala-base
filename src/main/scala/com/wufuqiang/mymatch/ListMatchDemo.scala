package com.wufuqiang.mymatch

/**
 * @author: Wu Fuqiang
 * @create: 2021-06-07 12:54
 *
 */
object ListMatchDemo {
  def main(args: Array[String]): Unit = {
    val list = Array(List(0),List(1,0),List(0,0,0),List(1,0,0))
    for(l <- list){
      val result = l match {
        case 0::Nil => s"${l}匹配0::Nil"
        case x::y::Nil => s"${l}匹配x::y::Nil，x=${x},y=${y}"
        case 0::tail => s"${l}匹配0::tail"
        case _ => "没有匹配到"
      }
      println(result)
    }
  }

}
