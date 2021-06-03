package com.wufuqiang.myclass

/**
 * @author: Wu Fuqiang
 * @create: 2021-06-03 13:02
 *
 */
object InnerClassDemo extends App {
  private val outerClass = new OuterClass
  private val innerClass = new outerClass.InnerClass
  innerClass.info()

}

class OuterClass{
  myOuter=>
  class InnerClass{
    def info()={
      //访问外部类的两种方式
      println(s"name=${OuterClass.this.name},sal=${myOuter.sal}")
    }
    //类型投影，类型投影的作用就是屏蔽外部对象对内部类对象的影响
    def test(ic : OuterClass#InnerClass)={
      println(ic)
    }
  }

  var name:String = _
  private var sal:Double = 1.2
}
