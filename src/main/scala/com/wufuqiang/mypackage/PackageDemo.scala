package com.wufuqiang.mypackage

/**
 * @author: Wu Fuqiang
 * @create: 2021-05-30 22:42
 *
 */
class PackageDemo {

}

package object packagedemo1{

  println("包对象packagedemo1")

  def packagedemo1println():Unit={
    println("包对象中的方法")
  }

}


package packagedemo1{


  class PersonPackage{
    def PersonPackage():Unit={
      packagedemo1println()
    }

  }

}
