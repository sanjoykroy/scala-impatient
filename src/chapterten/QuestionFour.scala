package chapterten

object QuestionFour {
  def main(args: Array[String]) {

    val cryptoWithConsoleLogger = new CryptoLogger with ConsoleLogger
    cryptoWithConsoleLogger.printLog

    val cryptoWithConsoleAndCipherLogger = new CryptoLogger with ConsoleLogger with CipherLogger
    cryptoWithConsoleAndCipherLogger.printLog

    val cryptoWithConsoleAndCipherLogger2 = new { override val key = -3} with CryptoLogger with ConsoleLogger with CipherLogger
    cryptoWithConsoleAndCipherLogger2.printLog
  }
}
