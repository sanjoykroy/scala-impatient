package chaptereleven


class Table() {
  private var html: String = "<table>\n<tr>"
  override def toString = html + "</tr>\n</table>"
  def |(str: String) = {
    html += "<td>" + str + "</td>"
    this
  }
  def ||(str: String) = {
    html += "</tr><tr><td>" + str + "</td>"
    this
  }
}

object Table {
  def apply() = new Table()
}

