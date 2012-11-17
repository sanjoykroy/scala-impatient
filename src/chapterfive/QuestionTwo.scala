package chapterfive


object QuestionTwo {
  def main(args: Array[String]) {
    val myAccount = new BankAccount
    println(myAccount.balance)
    myAccount.deposit(20.0)
    println(myAccount.balance)
    myAccount.withdraw(3.4)
    println(myAccount.balance)
    myAccount.withdraw(25)
    println(myAccount.balance)
  }
}
