package chaptereight

class BankAccount(initialBalance: Double) {
  private var balance = initialBalance
  def deposit(amount: Double) = { balance += amount; balance }
  def withdraw(amount: Double) = { balance -= amount; balance }
  def currentBalance : Double = balance
  def addInterest(amount: Double) = { balance += amount; balance }
  override def toString = "Balance :: " + balance
}
