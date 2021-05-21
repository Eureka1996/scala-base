package com.wufuqiang.myprint

/**
 * @author: Wu Fuqiang
 * @create: 2021-05-21 20:03
 *
 */
object PrintDemo {
  def main(args:Array[String]):Unit={
    val name:String = "wufuqiang"
    val age:Int = 15
    val sal:Float = 23.6f
    val height:Double = 123.455
    printf("name:%s,age:%d,sal:%.3f,height:%.3f.\n",name,age,sal,height)

    val info:String = s"name:$name,age:$age"
    println(info)

    val info2:String = s"name:${name},age:${age+20}"
    println(info2)
  }
}

