package chapterten


trait ConsoleLogger extends Logger {
  override def log(msg: String) { println(msg) }
}
