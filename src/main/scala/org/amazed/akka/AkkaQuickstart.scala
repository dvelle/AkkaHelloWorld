package org.amazed.akka

import akka.actor.{Actor, ActorLogging, ActorRef, ActorSystem, Props}


class HelloActor extends Actor {
  def receive = {
    case "hello" => println("hello back at you")
    case _ => println("huh?")
  }
}
object AkkaQuickstart extends App {

  val system = ActorSystem("HelloSystem")
  val helloActor = system.actorOf(Props[HelloActor], name = "helloactor")
  helloActor ! "hello"
  helloActor ! "Buenos dias"

}
