package chapternine

import io.Source

object PrintSrcAttributeValueOfImgTag {
  def main(args: Array[String]) {
    val source = Source.fromURL("http://www.website.com", "UTF-8") // Enter a valid website address that has some images
    val pattern = "<img[^>]+src\\s*=\\s*['\"]([^'\"]+)['\"][^>]*>".r
    val lineIterator = source.getLines()
    for (line <- lineIterator) {
      for (pattern(src) <- pattern.findAllIn(line)){
        println(src)
      }
    }
    source.close()
  }
}
