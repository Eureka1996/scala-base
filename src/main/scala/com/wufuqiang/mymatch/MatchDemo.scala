package com.wufuqiang.mymatch

/**
 * @author: Wu Fuqiang
 * @create: 2021-06-06 20:38
 *
 */
object MatchDemo {
  def main(args: Array[String]): Unit = {
    val oper = '*'
    val n1 = 10
    val n2 = 32
    var res = 0
    oper match {
      case '+' =>{
        println("加法操作")
        res = n1 + n2
      }
      case '-' =>{
        println("减法操作")
        res = n1 - n2
      }
      case '*' =>{
        println("乘法操作")
        res = n1 * n2
      }
      case '/' =>{
        println("除法操作")
        res = n1 /n2
      }
      case _ => println("操作符错误")
    }
    println(res)

    for( c <- "wuFuQiang_*12&^3321"){
      c match {
        case _ if(c >= 'a' && c <= 'z')=>println("小写字母")
        case _ if(c >= 'A' && c <= 'Z')=>println("大写字母")
        case _ if(c >= '0' && c <= '9')=>println("数字字符")
        case nc => println(s"变量打印$nc")
        case _ =>println("无法判断的字符")
      }
    }

    val t = 4
    val obj =if(t == 1) 1
    else if(t == 2) "2"
    else if(t == 3) BigInt(3)
    else if(t == 4) Map("aa"->1)
    else if(t == 5) Array(1,2,3)
    else if(t == 6) Array("aa",1)
    else if(t == 7) Array("aa")

    val result = obj match {
      case a:Int => a
      case b:Map[String,Int]=>"对象是一个字符串-数字的Map集合"
      case c:Map[Int,String]=>"对象是一个数字-字符串的Map集合"
      case d:Array[String]=>"对象是一个字符串数组"
      case e:Array[Int]=>"对象是一个数字数组"
      case f:BigInt=>Int.MaxValue
      case _ => "没有任务匹配"
    }
    println(result)

    //match中每一个case都可以单独提取出来
    val (x,y) =(10,20)
    println(s"x=$x,y=$y")
    val (q,r) = BigInt(10) /% 3 // q = BigInt(10)/3 , r = BigInt(10)%3
    println(s"q=$q,r=$r")
    val arr = Array(1,7,2,9)
    val Array(first,second,_*) = arr
    println(s"first=$first,second=$second")

  }

}
