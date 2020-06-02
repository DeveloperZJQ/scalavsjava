package actorprogram

import akka.actor.{Actor, ActorSystem, Props}

class HelloActor2 extends Actor{
  override def receive: Receive = {
    case "start" => println("start")
    case "stop" => println("stop")
    case "end" => println("end")
  }
}

object Actor2{
  def main (args: Array[String] ): Unit = {
    val system = ActorSystem("Actor2")
    val helloActor = system.actorOf(Props(new HelloActor2), "HelloActor2")

    helloActor  ! "start"
    helloActor  ! "stop"
    helloActor  ! "end"

    system.awaitTermination()
  }
}
