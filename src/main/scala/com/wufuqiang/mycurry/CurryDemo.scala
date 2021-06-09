package com.wufuqiang.mycurry

/**
 * @author: Wu Fuqiang
 * @create: 2021-06-08 18:51
 *
 */
object CurryDemo {
  def main(args: Array[String]): Unit = {
    def eq(s1:String,s2:String):Boolean ={
      s1.equals(s2)
    }

    implicit class TestEq(str:String){
      def checkEq(ss:String)(f:(String,String)=>Boolean):Boolean={
        f(str.toLowerCase(),ss.toLowerCase())
      }
    }

    println("WuFuqiang".checkEq("wufuqiANG")(eq))
    println("WuFuqiang".checkEq("wufuqiANG")((s1:String,s2:String)=>s1.equals(s2)))
    println("WuFuqiang".checkEq("wufuqiANG")(_.equals(_)))

  }

}
