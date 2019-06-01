package com.soupcoders.memezio

import scalaz.zio.console._
import scalaz.zio._

object Application extends App {

  override def run(args: List[String]): ZIO[Console, Nothing, Int] =
    putStrLn("Hello World").fold(_ => 1, _ => 0)

}
