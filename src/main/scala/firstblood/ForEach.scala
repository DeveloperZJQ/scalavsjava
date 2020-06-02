package firstblood

import java.util.Date

object ForEach {
  def main(args: Array[String]): Unit = {
//    for (a <-0 to 10;b<-0 to 10){
//      println(a+"=="+b)
//    }
//    val values = (name:Int) =>{
//      2*name
//    }
//    println(values(1))
//    val date = new Date()

//    val stringToUnit = logWithDate(date, _: String)
//    stringToUnit("12321")


//    println(fun7(1,2)(3,4))

//    println(makeAdd()(1))

//    val str = "abcd"
//    val str1 = "ABCD"

//    println(str.indexOf(96))
//    println(str.indexOf("b"))
//
//    println(str.equalsIgnoreCase(str1))

    val lists = List(List(1,2,3),List(2,3,4),List(3,4,5))
    val lists2 = List(1,23,4)
    val s = List("123,323,43,545,2343")
    val nameList = List(
      "hello bjsxt",
      "hello xasxt",
      "hello shsxt"
    )

    val value = s.flatMap(s=>s.split(""))
    val flatMapResult : List[String] = nameList.flatMap{ x => x.split(" ") }
      println(flatMapResult)

  }
  def makeAdd() = {
    val more = 10
    (x: Int) => x + more
  }

  def fun7(a :Int,b:Int)(c:Int,d:Int) = {
    a+b+c+d
  }
  def logWithDate(date:Date,log:String)={
      println(s"date is=$date . and log is=$log.")
  }



}
