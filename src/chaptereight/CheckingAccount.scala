package chaptereight


class CheckingAccount(amount: Double) extends BankAccount(amount) {
  private var totalCharge:Double = 1.0

  override def deposit(amount: Double) = {
    super.deposit(amount)
    charge
  }

  override def withdraw(amount: Double) = {
    super.withdraw(amount)
    charge
  }

  def charge = {
    totalCharge += 1
    totalCharge
  }

  override def toString = super.toString + " Charge :: "+ totalCharge
}
