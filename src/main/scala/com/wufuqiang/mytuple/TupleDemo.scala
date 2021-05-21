package com.wufuqiang.mytuple

object TupleDemo {
  def main(args: Array[String]): Unit = {
    var t1 = (1,2,3,"wufuqiang")
    println(t1._2)
    for( i <- t1.productIterator){
      println(i)
    }
  }

}
