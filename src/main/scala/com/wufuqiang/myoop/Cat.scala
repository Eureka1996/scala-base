package com.wufuqiang
package myoop

//默认为public
class Cat {
  //属性必须给默认值
  //默认为private，并同时生成两个public方法
  //name()        get
  //name$eq()       set
  //如果显示声明为private，name/name$eq也将成为private方法
  var name:String = _
  var age:Int = 0
  var color:String = _

}
