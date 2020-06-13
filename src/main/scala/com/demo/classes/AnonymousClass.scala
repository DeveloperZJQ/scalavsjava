package com.demo.classes

/**
 * @author happy
 * @create 2020-06-13
 */

abstract class Listener{
  def trigger
}

object AnonymousClass{
  val myListenner = new Listener {
    override def trigger: Unit = {println(s"Trigger at ${new java.util.Date}")}
  }

  myListenner.trigger
}