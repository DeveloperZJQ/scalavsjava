package firstblood

/**
 * @author happy
 * @create 2020-03-18 23:57
 * compare loop function about while and for use java
 */
class Test01 {
  private val age = 0
  private val name = "zhangsan"
  def waterMelon(s: String): String ={
    if(s.length>5){
      "five"
    }else{
      "smaller then five"
    }
  }
}

object Test01{
  def main(args: Array[String]): Unit = {
    val t = new Test01()
    val start1 = System.currentTimeMillis()
    for(a<-1 to 1000){println("---------463----------->"+a)}
    val end1    = System.currentTimeMillis()
    val start2  = System.currentTimeMillis()
    var a =1000;
    while (a!=0){
      println("---------443----------->"+a)
      a=a-1
    }
    val end2   = System.currentTimeMillis()
    println("end1-start1----------------->"+(end1-start1))
    println("end2-start2----------------->"+(end2-start2))
  }
}
