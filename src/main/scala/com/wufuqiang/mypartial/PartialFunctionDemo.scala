package com.wufuqiang.mypartial

/**
 * @author: Wu Fuqiang
 * @create: 2021-06-07 23:53
 *
 */
object PartialFunctionDemo {
  def main(args: Array[String]): Unit = {
    val list = List(1,2,3,4,"wufuqiang")

    //表示偏函数接收的参数类型是Any，返回类型是Int
    //isDefinedAt(x:Any)如果返回true，就会去调用apply构建对象实例，如果是false，过滤掉
    val partialFun1 = new PartialFunction[Any,Int] {
      override def isDefinedAt(x: Any): Boolean = x.isInstanceOf[Int]

      override def apply(v1: Any): Int = {
        println("apply方法被调用。")
        v1.asInstanceOf[Int]+1
      }
    }
    val list2 = list.collect(partialFun1)
    println(list2)

    //偏函数的简化形式
    val list3 = list.collect(f2)
    println(list3)

    val list4 = list.collect { case i: Int => i + 1 }
    println(list4)

    val list5 = List(1, 2, 3, 1.2, 3.4, 5.3, "wuufuqiang").collect {
      case i: Int => i + 1
      case d: Double => d * 2
      case s: String => s + "maoyujiao"
    }
    println(list5)

  }

  def f2:PartialFunction[Any,Int]={
    case i:Int => i+1    //case语句可以自动转换为偏函数
  }




}
