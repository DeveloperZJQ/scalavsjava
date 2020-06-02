package implicitprogram

/**
 * demo2
 * @param name
 */
case class Man(name:String)
case class SuperMan(name:String){
  def emitLaser = println("emit a pingpang ball!")
}
case class Woman(name:String){
  def noise = println(s"${name} give me  a hug!")
}

object Implicit02 {
  implicit def man2Superman(man:Man):SuperMan = new SuperMan(man.name)
  implicit def man2Woman(man:Man):Woman = new Woman(man.name)

  def main(args: Array[String]): Unit = {
    val yasaka = new Man("yasaka")
    yasaka.emitLaser
    yasaka.noise
  }
}
