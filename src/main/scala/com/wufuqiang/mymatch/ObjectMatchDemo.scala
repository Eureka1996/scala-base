package com.wufuqiang.mymatch

/**
 * @author: Wu Fuqiang
 * @create: 2021-06-07 16:23
 *
 */
object ObjectMatchDemo {
  def main(args: Array[String]): Unit = {
    val number = 36.0
    number match {
        //调用Square的unapply(z:Double),z的值就是number
      case Square(n)=> println(n)
      case _ => println("nothing matched")
    }

  }


}

object Square{
  def unapply(z:Double): Option[Double] = Some(math.sqrt(z))

  def apply(z: Double): Double = z*z

  val name = "wu,fu,qiang"
  name match {
    case Names(first,second,third) =>{
      println(s"the string contain three people's names:$first|$second|$third")
    }
    case _ => println("nothing matched")
  }
}

object Names{
  def unapplySeq(arg: String): Option[Seq[String]] = {
    if(arg.contains(",")){
      Some(arg.split(","))
    }else{
      None
    }
  }
}

