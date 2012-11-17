package chapterfive


object QuestionSeven {
  def main(args: Array[String]) {
    val person = new AnotherPerson("John Smith")
    println(person.firstName)
    println(person.lastName)
    val person2 = new AnotherPerson("Peter")
    println(person2.firstName)
    println(person2.lastName)
  }
}
