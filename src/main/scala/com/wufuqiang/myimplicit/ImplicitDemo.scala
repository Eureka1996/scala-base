package com.wufuqiang.myimplicit

/**
 * @author: Wu Fuqiang
 * @create: 2021-06-03 13:33
 *
 */
object ImplicitDemo extends App {
  implicit def d2i(d:Double):Int={
    (d+1).toInt
  }

  implicit def mysql2Db(mysql:MySQL2021060301)={
    new DB
  }
  val num:Int = 3.45
  println(num)

  private val mysql = new MySQL2021060301
  mysql.insert(123)
  mysql.delete(456)


  implicit val name:String = "wufuqiang"
  def hello(implicit str:String): Unit ={
    println(s"$str Hello")
  }

  hello

  implicit val age:Int = 15
  def getMyAge(implicit age:Int=20): Unit ={
    println(s"my age $age")
  }

  getMyAge

  getMyAge()

}

class MySQL2021060301{
  def insert(id:Int):Unit={
    println(s"向mysql数据库中插入数据，id=$id")
  }
}

class DB{
  def delete(id:Int)={
    println(s"删除数据库的数据，id=$id")
  }
}


