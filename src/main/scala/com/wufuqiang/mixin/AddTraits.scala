package com.wufuqiang.mixin

/**
 * @author: Wu Fuqiang
 * @create: 2021-06-02 19:13
 *
 */
object AddTraits extends App {
  //叠加特质，创建一个对象时，从左到右
  private val mysql = new Mysql3 with DB2 with File2
  println(mysql)

  //执行方法时从右向左
  //当执行到super时，是指左边的特质
  //如果左边没有特质，则super就是父特质
  //如果想要调用具体特质的方法，可以指定：super[特质].xxx()。其中的泛型必须是该特质的直接超类类型
  mysql.insert(111)

  mysql.update(321)

}

trait Operate2{
  println("Operate4....")
  def insert(id:Int):Unit
}

trait Data2 extends Operate2{
  println("Data2")

  override def insert(id:Int): Unit = println(s"Data2插入数据:$id")
}

trait DB2 extends Data2{
  println("DB2")

  override def insert(id: Int): Unit = println(s"DB2实际向数据库中插入数据：$id")

  def update(id:Int):Unit = println(s"DB2更新数据:$id")
}

trait File2 extends Data2{
  println("File2")

  override def insert(id: Int): Unit = {
    println(s"File2实际向文件中插入数据：$id")
    super.insert(id)
  }
}

class Mysql3{

}
