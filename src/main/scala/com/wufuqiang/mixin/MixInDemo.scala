package com.wufuqiang.mixin

/**
 * @author: Wu Fuqiang
 * @create: 2021-06-02 18:18
 *
 */
object MixInDemo extends  App {
  private val oracleDb = new OracleDb with Operate1
  oracleDb.insert(123)
  private val mysql1 = new MySQL1 with Operate1
  mysql1.insert(456)

  private val mysql2 = new MySQL2 with Operate1 {
    override def connect(): Unit = println("创建MySQL的connect。")
  }

  mysql2.connect()
  mysql2.insert(12)

}

trait Operate1{
  def insert(id:Int):Unit={
    println(s"插入数据：$id")
  }
}

class OracleDb{

}

abstract class MySQL1{

}

abstract class MySQL2{
  def connect()
}
