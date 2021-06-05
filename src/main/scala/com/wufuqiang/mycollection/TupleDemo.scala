package com.wufuqiang.mycollection

/**
 * @author: Wu Fuqiang
 * @create: 2021-06-04 13:25
 *
 */
object TupleDemo {
  def main(args: Array[String]): Unit = {
    val tuple1 = (1,2,3,4,"2")
    println(tuple1)
    println("-"*20)
    println(tuple1._2)
    println("-"*20)
    //使用方法，下标从0开始
    println(tuple1.productElement(2))
    println("-"*20)
    for(i <- tuple1.productIterator){
      println(i)
    }
  }
}
