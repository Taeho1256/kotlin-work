// COMP2850 Portfolio: Week 5
// StudentAccount class

package comp2850.banking

class StudentAccount(holder: String) : BankAccount(holder) {

    var overdraft = 0
        set(value) {
            require(value in 0..100)
            field = value
        }

    override fun withdraw(amount: Int) {
        require(amount > 0) {
            "Withdrawal amount must be greater than 0"
        }

        require(amount.toLong() <= balance.toLong() + overdraft) {
            "Insufficient funds for withdrawal"
        }

        balance -= amount
    }

    fun withdrawalsAllowed(): Boolean {
        return balance > -overdraft
    }

    override fun toString(): String {
        return "Account for $holder, balance = $balance (overdraft = $overdraft)"
    }
}
