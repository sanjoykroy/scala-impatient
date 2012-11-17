package chapterfive


class BankAccount {
  private var privateBalance = 0.0
  def deposit(amount: Double) { privateBalance += amount }
  def withdraw(amount: Double) { if(amount <= privateBalance ) privateBalance -= amount }
  def balance = privateBalance
}
