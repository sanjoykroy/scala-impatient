package chapterfive


class AnotherPerson(private val fullName: String) {
  def firstName = if (fullName.contains(" ")) fullName.substring(0, fullName.indexOf(" ")) else fullName
  def lastName = if (fullName.contains(" ")) fullName.substring(fullName.indexOf(" ")).trim else ""
}
