package com.demo.future

import concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Future
import scala.util.{Failure, Success}
/**
 * collections of future
 * @author happy
 * @create 2020-06-13
 *
 */
object FutureDemo1 {

  //异步处理
  def nextFtr(i:Int=0) =Future{
    def rand(x:Int) = util.Random.nextInt(x)

    Thread.sleep(rand(5000))
    if (rand(3)>0) (i+1) else throw new Exception
  }

  def main(args: Array[String]): Unit = {
    val f = concurrent.Future{Thread.sleep(5000);println("hi")}

    f.onComplete{
      case Success(v)   =>  v
      case Failure(e)   =>  "i am not ok"
    }



    println("hello")
  }

}
