package com.demo.functions

/**
 * @author happy
 * @create 2020-06-11 22:31
 */
object FucDemo {

  //定义无输入函数
  def hi = "hi"

  //定义函数
  def multiplier(x:Int,y:Int):Int=x*y

  //用空括号定义函数
  def hi(hi:String) :String=s"$hi"

  //使用表达式块调用函数
  def formatEuro(amt:Double) = f"$amt%.2f"

  //简单递归函数求阶乘
  def power(x:Int):Int={
    if (x<1)
      1
    else
      x*power(x-1)
  }

  //尾递归
  @annotation.tailrec
  def power(x:Int,y:Int,t:Int=1):Int={
    if (y<1) t
    else power(x,y-1,x*t)
  }

  //部分应用函数和柯里化
  def factorOf(x:Int,y:Int) = y%x ==0
  def factorOf2(x:Int)(y:Int) = y%x ==0
  def multipleOf3 = factorOf(3,_:Int)

  //偏函数
  val statusHandler:Int => String ={
    case 200  =>  "ok"
    case 400  =>  "you error"
    case 500  =>  "system error"
  }

  def main(args: Array[String]): Unit = {
    val isEven = factorOf2(2)_
    println(statusHandler(200))
    println(isEven(32))
  }
}
