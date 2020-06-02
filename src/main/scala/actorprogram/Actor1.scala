package actorprogram


import akka.actor.{Actor, ActorRef, ActorSystem, Props}

/**
 * demo1
 */
class HelloActor extends Actor {
  override val receive:Receive = {
    case "start"    => println("ok , prepare start")
    case "running"  => println("ok , prepare running")
    case "stop"     => println("ok , prepare stop")
  }
}

object Actor1 {
  def main(args: Array[String]): Unit = {
    val system =  ActorSystem("HelloActor")
    val helloActor = system.actorOf(Props[HelloActor], "helloActor")
//    val str = StdIn.readLine()
//    println(str)

    helloActor ! "start"
    helloActor ! "running"
    helloActor ! "stop"

    system.awaitTermination()
  }
}