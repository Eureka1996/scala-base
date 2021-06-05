package com.wufuqiang.mycollection

import scala.collection.mutable

/**
 * @author: Wu Fuqiang
 * @create: 2021-06-05 14:02
 *
 */
object MapDemo {
  def main(args: Array[String]): Unit = {
    //不可变Map，默认的
    val map1:Map[String,Int] = Map("count"->15,"size"-> 20)
    println(map1)

    //可变Map
    val map2 = scala.collection.mutable.Map("name"->"wufuqiang","age"->10)
    println(map2)

    //创建空Map
    val map3 = new mutable.HashMap[String,Int]
    println(map3)

    //对偶元组
    val map4 = mutable.Map(("wu",2),("fu",2),("qiang",5))
    println(map4)

    //如果key不存在，则抛出异常java.util.NoSuchElementException: key not found: ff
    val value4 = map4("wu")
    println(value4)

    val maybeInt = map4.get("wu") //Some
    println(maybeInt)
    val maybeInt2 = map4.get("fwu") //Some
    println(maybeInt2)

    val value42 = map4.get("wu").get   //得到Some，再取出值
    println(value42)

    //如果key存在，则修改，如果Key不存在，则添加
    map4("wu") = 321
    map4("fwu") = 12345

    val value43 = map4.getOrElse("wu", 123)
    println(value43)

    val value44 = map4.getOrElse("fwu", 123)
    println(value44)

    map4+=("mao"->3,"yu"->2)

    map4-=("wu","fu")

    for(item <- map4) println(s"key=${item._1}")
    for(key <- map4.keys) println(key)
    for(value <- map4.values) println(value)
    for((k,v) <- map4) println(s"key=$k,value=$v")

  }

}
