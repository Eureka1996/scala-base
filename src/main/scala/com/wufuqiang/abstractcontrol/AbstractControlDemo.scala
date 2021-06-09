package com.wufuqiang.abstractcontrol

/**
 * @author: Wu Fuqiang
 * @create: 2021-06-09 21:03
 *
 */
object AbstractControlDemo {
  def main(args: Array[String]): Unit = {
    def myRunInThread(f1:()=>Unit) = {
      new Thread{
        override def run():Unit={
          f1()
        }
      }.start()
    }


    myRunInThread(()=>{
      println("干活开始")
      Thread.sleep(5000)
      println("结束干活")}
      )

    myRunInThread{()=>
      println("干活开始")
      Thread.sleep(5000)
      println("结束干活")
    }

    def myRunInThread2(f1: =>Unit) = {
      new Thread{
        override def run():Unit={
          f1
        }
      }.start()
    }

    myRunInThread2{
      println("干活开始")
      Thread.sleep(5000)
      println("结束干活")
    }
    var x = 0;
    until(x>0){
      x-=1
      println(s"x=$x")
    }
  }

  def until(condition: => Boolean)(block: => Unit):Unit={
    if(condition){
      block
      until(condition)(block)
    }
  }

}
