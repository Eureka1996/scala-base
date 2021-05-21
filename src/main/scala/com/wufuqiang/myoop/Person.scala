package com.wufuqiang{
  //包可以包含类、对象和特质，但不能包含函数或变量的定义
  //每个包可以有一个包对象。需要在父包中定义它，且名称与子包一样
  package object myoop{
    val defaultName = "Mr. Wufq"

    def sayHello = "Hello"
  }


  package myoop{
    import scala.beans.BeanProperty
    //类和它的伴生对象可以相互访问私有特性，它们必须存在于同一个源文件中
    class Person {

      var name:String =_
      var age:Int=_
      private[this] var passworld:String = _  //访问someObject.passwold将不被允许，this可指定其它包
      @BeanProperty var hairColor:String = _
      override def toString: String = {

        this.name +","+this.age+",defaultName:"+defaultName+",sayHello"+sayHello
      }

      def getObjectInfo(): Unit ={
        Person.head
      }


    }

    object Person{
      var head:String = _
      def test1: Unit ={

      }
    }

  }
}

