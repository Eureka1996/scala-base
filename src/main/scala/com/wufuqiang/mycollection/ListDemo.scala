package com.wufuqiang.mycollection

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

  }

}
