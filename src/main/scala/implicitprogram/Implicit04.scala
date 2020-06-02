package implicitprogram

/**
 * 隐式值
 * 隐式参数
 * 隐式对象
 */
object Implicit04 {
  implicit val name: String = s"$name ,hello,i am purple ."
  implicit def age(a:Int):String = s"${a.toString} ,hello,i am purple ."
//  implicit val hello: String = s"hello,i am purple ."

//  implicit def intToStr(age:Int): String = s"now , i am ${age.toString} years old."

//  implicit def implicitParamFun(name:String)(implicit age:Int): Unit ={
//    val s = s"i am $name and i am $age years old."
//    println(s)
//  }

  def echo(param: String)(implicit impl: String) {
    println(param + "," + impl)
  }

  def main(args: Array[String]): Unit = {
      echo("100")
      println(age(10))
  }

}
