package bank;

public class SavingsAccount extends BankAccount{
	private double withdrawalLimit;

    public SavingsAccount(double initialBalance, double withdrawalLimit) {
        super(initialBalance);
        this.withdrawalLimit = withdrawalLimit;
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= withdrawalLimit && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn from SavingsAccount: $" + amount);
        } else {
            System.out.println("Withdrawal limit exceeded or insufficient funds. Withdrawal denied.");
        }
        System.out.println("Current Savings Balance: $" + balance);
    }

}