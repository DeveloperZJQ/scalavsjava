package implicitprogram

class Person(implicit name:String){
  println(s"$name is a lucky dog.")
}

object Implicit03 {
  def implicitFun(implicit name:String): Unit ={
    println(s"$name is a lucky dog.")
  }
  def main(args: Array[String]): Unit = {
    System.out.println("nihao")
  }
}
