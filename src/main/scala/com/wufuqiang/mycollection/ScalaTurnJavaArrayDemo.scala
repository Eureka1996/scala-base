package com.wufuqiang.mycollection

import scala.collection.mutable.ArrayBuffer

/**
 * @author: Wu Fuqiang
 * @create: 2021-06-04 13:15
 *
 */
object ScalaTurnJavaArrayDemo {
  def main(args:Array[String]):Unit={

    var arr = ArrayBuffer("1","2","3")
    //隐式转换，scala arraybuffer转java list
    import scala.collection.JavaConversions.bufferAsJavaList

    //scala arraybuffer转java list
    var javaArr = new ProcessBuilder(arr)
    val arrList = javaArr.command()
    arrList.toArray().toBuffer

  }

}
