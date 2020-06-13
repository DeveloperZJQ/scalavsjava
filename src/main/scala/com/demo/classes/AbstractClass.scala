package com.demo.classes

/**
 * @author happy
 * @create 2020-06-13 08:38
 */

//抽象类
abstract class AbstractClass {
  val year:Int
  val automatic:Boolean = true
  def color:String
}

//抽象来不能被实例化
class A extends AbstractClass{
  override val year: Int = _
  override val automatic: Boolean = _
}
