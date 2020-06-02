package implicitprogram

/**
 *
 */
case class SpecialPerson(name:String)
case  class Student(name:String)
case class Older(name:String)
case class Teacher(name:String)

object Implicit01 {
  implicit def object2SpecialPerson(obj:Object):SpecialPerson={
    obj match {
      case obj if obj.getClass==classOf[Student] => SpecialPerson(obj.asInstanceOf[Student].name)
      case obj if obj.getClass==classOf[Older]   => SpecialPerson(obj.asInstanceOf[Older].name)
      case _                                              => SpecialPerson(obj.asInstanceOf[Teacher].name)
    }
  }

  var tickerNumber = 0

  def buySpecialTicker(p:SpecialPerson)={
    tickerNumber += 1
    "T-"+tickerNumber
  }

  def main(args: Array[String]): Unit = {
    val chengxiaoxiao = new Student("chengxiaoxiao")
    println(buySpecialTicker(chengxiaoxiao))
    val gaga = new Older("gaga")
    println(buySpecialTicker(gaga))
    val yasaka = new Teacher("yasaka")
    println(buySpecialTicker(yasaka))

  }
}
