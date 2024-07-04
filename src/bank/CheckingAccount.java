package bank;

public class CheckingAccount extends BankAccount{
	private double withdrawalFee;

    public CheckingAccount(double initialBalance, double withdrawalFee) {
        super(initialBalance);
        this.withdrawalFee = withdrawalFee;
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            balance -= withdrawalFee; // Apply withdrawal fee
            System.out.println("Withdrawn from CheckingAccount: $" + amount);
            System.out.println("Withdrawal Fee: $" + withdrawalFee);
        } else {
            System.out.println("Insufficient funds. Withdrawal denied.");
        }
        System.out.println("Current Checking Balance: $" + balance);
    }
}