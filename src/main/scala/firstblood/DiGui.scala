package firstblood

import scala.math.Numeric.IntIsIntegral

/**
 * test
 */
class DiGui {

  @annotation.tailrec
  final def sumDiGui(num:Int,temp:Int=0):Int={
    if (num<1)
      temp
    else{
      sumDiGui(num-1,temp+num)
    }
  }

  @annotation.tailrec
  final def fangDai(total:Double,money:Double,temp:Double=0):Double={
    if (total<=2510.52)
      temp
    else {
      fangDai(total-money,money,total+temp)
    }
  }

  @annotation.tailrec
  final def diGui(age:Int, temp:Int=1): Int ={
    if (age<1){
      temp
    }else{
      diGui(age-1,temp*age)
    }
  }

  final  def diGuiFun(num:Int,temp:Int=0):Int={
    if (num<1)
      temp
    else
      diGuiFun(num-1,num+temp)
  }
}

object DiGui{
  def main(args: Array[String]): Unit = {
    val gui = new DiGui
    println(gui.diGui(6))
    println(gui.diGuiFun(6))
    println(gui.sumDiGui(10))
    println(gui.fangDai(5656.25,10.52))
  }
}
