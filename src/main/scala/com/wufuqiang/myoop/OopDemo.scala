package com.wufuqiang.myoop

object OopDemo {
  def main(args: Array[String]): Unit = {
    val cat = new Cat
    cat.name = "小白"
    cat.age = 10
    cat.color = "white"
    println(s"小猫的信息：name=${cat.name},")
    testPriority()
  }
  def testPriority(): Unit ={
    val per:Person = new Person
    per.name = "wufuqiang"
    per.age = 20
    Person.head = "wufq"
    println(per)
  }

  def test(): Unit ={
    //使用绝对包名，以_root_开始
    val subordinates = new _root_.scala.collection.mutable.ArrayBuffer[Int]()
  }
}
