package chapterten


trait CipherLogger extends Logger {

  val key : Int = 3
  private val alphaU='A' to 'Z'
  private val alphaL='a' to 'z'

  override def log (msg: String) {
    super.log("Msg : " + msg)
    val encrypted=encrypt(msg, key)
    super.log("Encrypted : " + encrypt(msg, key))
    super.log("Decrypted : " + decrypt(encrypted, 3))
  }

  def encrypt(text:String, key:Int) = text.map {
    case c if alphaU contains c => cipher(alphaU, c, key)
    case c if alphaL contains c => cipher(alphaL, c, key)
    case c => c
  }

  def decrypt(text:String, key:Int) = encrypt(text,-key)

  private def cipher(a:IndexedSeq[Char], c:Char, key:Int) = a ( ( c - a.head + key + a.size) % a.size )

}
