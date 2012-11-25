package chaptereight


class SavingAccount(amount: Double) extends BankAccount(amount) {

  override def deposit(amount: Double) = {
    super.deposit(amount)
  }

  override def withdraw(amount: Double) = {
    super.withdraw(amount)
  }

  def earnMonthlyInterest = { super.addInterest(super.currentBalance * 2 / 100) }


}
