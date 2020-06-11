package com.demo.expression

/**
 * @author happy
 * @create 2020-06-11 19:14
 * scala表达式
 */
class ExpressionDemo {

  //简单表达式
  def printString(s:String): Unit ={
    val data = s;
    println(s"this word is ---->$data")
  }

  //用表达式定义值和变量
  def worthAndChange ={
    val s       = 5*20
    val amount  = s+10
    amount
  }

  //if···else   --demo1
  def ifAndElse(): Unit ={
    if (47%3>0) println("Not a multiple of 3")
  }

  //if···else   --demo2
  def ifAndElse2() ={
    if(false) "what a fuck!"
  }

  //match
  def matchDemo(x:Int,y:Int) ={
    val max = x>y match{
      case true   => x
      case false  => y
    }
    max
  }

  //通配符
  def messageDemo(message:String):Int ={
    val status = message match{
        case "ok"     => 200
        case "not ok" => 100
    }
    status
  }

  //pattern guard
  def guardDemo()={
    val response = null
    response match {
      case s if s !=null  => println(s"Receive $s")
      case s => println("Error! Receive a null response")
    }
  }

  //loop -- for
  def loopForDemo(): Unit ={
    for (x <- 1 to 10) println(s"this is a $x")
  }

  //loop -- for -- yield
  def loopForYieldDemo(): Unit ={
    for (x <- 1 to 100) yield {s"Day $x:"}
  }

  //迭代器哨卫
  def loopForDemo2(): Unit ={
    for (x <- 1 to 100 if x%3==0) yield x
  }

  //嵌套迭代器
  def loopDoubleFor(): Unit ={
    for {x<-1 to 100;y<-1 to 100}{
      print(s"$x,$y")
    }
  }

  //while
  def whileDemo1(): Unit ={
    var x = 10;
    while(x>0){
      x-=1
    }
  }

  //do ... while
  def doWhileDemo2()={
    var x =0
    do println(s"here i am, x=$x") while (x>0)
  }
}
