package com.demo.collections

import scala.collection.mutable
import scala.util.{Failure, Success, Try}

/**
 * @author happy
 * @create 2020-06-12 05:58
 */
object CollectionDemo {
  def main(args: Array[String]): Unit = {
    val listDemo  = List(1,2,3,3,4,5)
    val setDemo   = Set(1,23,3,4,5,4)

    //cons 或者 ::
    val first = Nil.::(1,12,7)

    //不可变集合
    val m = Map("APPL"->597,"MSFT"->40)
    val n = m - "APPL" + ("GOOG"-> 521)


    //可变集合 collection.mutable._
    val nums = mutable.Buffer(1)
    for (i<-1 to 10) nums+=i

    //不可变集合转可变集合
    val list = List(1,23,4,56)
    val buffer = list.toBuffer
    buffer+=2
    println(buffer)

    //Seq,创建list的快捷方式
    val ints = Seq(1, 2, 3, 4)

    //Stream
//    println(Stream(1,_))

    //Try... Success and Failure
    val input   = " 123 "
    val result  = Try(input.toInt) orElse Try(input.trim.toInt)
    result foreach(r=>println(s"Parsed '$input' to $r!"))

    val x  = result match {
      case Success(value) =>  Some(value)
      case Failure(ex)    =>  {println(s"Could not parse input '$input'");None}
    }

    //Future
  }
}
