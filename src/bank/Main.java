package bank;

public class Main {
	public static void main(String[] args) {
        // Example usage of SavingsAccount
		System.out.println("usage of SavingsAccount");
        SavingsAccount savings = new SavingsAccount(1000, 500);
        savings.deposit(200);
        savings.withdraw(300);
        savings.withdraw(700); // Attempt to withdraw more than withdrawal limits

        // Example usage of CheckingAccount
        System.out.println("\nusage of CheckingAccount");
        CheckingAccount checking = new CheckingAccount(2000, 5);
        checking.deposit(500);
        checking.withdraw(100);
        checking.withdraw(2500); // Attempt to withdraw more than balance
    }
}
