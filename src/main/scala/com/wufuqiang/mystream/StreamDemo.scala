package com.wufuqiang.mystream

/**
 * @author: Wu Fuqiang
 * @create: 2021-06-06 17:17
 *
 */
object StreamDemo {
  def main(args: Array[String]): Unit = {

    def numsForm(n:BigInt):Stream[BigInt] = n #:: numsForm(n+1)
    val stream1 = numsForm(1)
    println(stream1)
    println(s"head=${stream1.head}")
    println(s"tail=${stream1.tail}")
    println(stream1)

    println(numsForm(1).map(_*2))
  }

}
