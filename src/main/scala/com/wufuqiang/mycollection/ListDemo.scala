package com.wufuqiang.mycollection

import scala.collection.mutable
import scala.collection.mutable.{ArrayBuffer, ListBuffer}

/**
 * @author: Wu Fuqiang
 * @create: 2021-06-04 13:37
 *
 */
object ListDemo {
  def main(args: Array[String]): Unit = {
    //在scala中，List是不可变的，如果需要使用可变的，使用ListBuffer
    var list1 = List[Int](1,2,3,4,5)
    println(list1)
    println(list1(2))
    var list2 = Nil
    println(list2)

    var list3 = list1:+11
    println(list3)
    var list4 = 12+:list3
    println(list4)

    //运算规则从右向左
    var list5 = 5::6::list4::Nil
    println(list5)

    var list6 = 5::6::list4:::Nil
    println(list6)


    var list7 = List(1,2,3,4,5)

    val list8 = list7.map((item) => {
      item * item
    })

    println(list8)

    val list9 = List("wu", "fu", "qiang")
    val list10 = list9.map(item => item.toUpperCase())
    println(list10)

    //扁平化处理
    val list11 = list9.flatMap(item => item.toUpperCase())

    println(list11)

    val sumList7 = list7.reduceLeft((i1, i2) => i1 + i2)
    println(sumList7)

    //1-2-3-4-5
    val reduceLeftMinus = list7.reduceLeft((i1, i2) => i1 - i2)
    println(reduceLeftMinus)
    //1-(2-(3-(4-5)))
    val reduceRightMinus = list7.reduceRight((i1, i2) =>{
      println(s"i1=$i1,i2=$i2")
      i1 - i2
    })
    println(reduceRightMinus)

    val reduceMinus = list7.reduce((i1, i2) => i1 - i2)
    println(reduceMinus)

    val list12 = ListBuffer(1,3,21,5,2,5,6)
    val maxValue = list12.reduce((i1, i2) => math.max(i1, i2))
    println(maxValue)

    val foldLeftMinus = list7.foldLeft(list7(0))((i1, i2) => {
      i1 - i2
    })
    println(foldLeftMinus)

    val foldLeftMinus2 = (1/:list7)((i1,i2)=>i1-i2)
    println(foldLeftMinus2)

    val foldRightMinus = (list7 :\ 5) ((i1, i2) => i1 - i2)
    println(foldRightMinus)

    val scanLeftValue = (1 to 4).scanLeft(5)((i1, i2) => i1 + i2)
    println(scanLeftValue)

    val str:String = "wufuqiang"

    val arrayBufferValue = str.foldLeft(new ArrayBuffer[Char]())((i1: ArrayBuffer[Char], i2: Char) => {
      i1.append(i2.toUpper)
      i1
    })

    println(arrayBufferValue)

    val charCount = str.foldLeft(new mutable.HashMap[Char, Int]())((i1: mutable.HashMap[Char, Int], i2: Char) => {
//      i1.put(i2, i1.getOrElse(i2, 0) + 1)
      i1+=(i2->(i1.getOrElse(i2,0)+1))
    })
    println(charCount)


    //拉链
    val list13 = List(1, 2, 3, 4, 5)
    val list14 = List(6, 7, 8, 9, 10)
    val list15 = list13.zip(list14)
    println(list15)



  }

}
