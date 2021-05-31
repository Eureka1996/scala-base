package com.wufuqiang.myoop

/**
 * @author: Wu Fuqiang
 * @create: 2021-05-30 15:02
 *
 */
//如果主构造器中的形参没有任何修饰符，那么这个参数是局部变量
//如果使用val修饰，那么将作为类的私有的只读属性
//如果使用var修饰，娇柔将作为类的成员属性使用，并提供属性对应的get/set方法，即这时的成员属性是私有的，但可读写
class Person2 private(inName:String,inAge:Int) {

  var name:String = inName
  var age:Int = inAge
  var heigh:Double = _

  def this(name:String,age:Int,height:Double){
    this(name,age)
    this.heigh = height
  }
}
