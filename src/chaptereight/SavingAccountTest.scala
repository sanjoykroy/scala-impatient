package chaptereight


object SavingAccountTest {
  def main(args: Array[String]) {
    val account = new SavingAccount(100)
    account.earnMonthlyInterest
    println(account)
  }
}
