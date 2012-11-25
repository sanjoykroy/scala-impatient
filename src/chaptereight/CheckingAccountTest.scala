package chaptereight


object CheckingAccountTest {
  def main(args: Array[String]) {
    val account = new CheckingAccount(100)
    println(account)
    account.deposit(200)
    println(account)
    account.withdraw(50)
    println(account)
  }
}
