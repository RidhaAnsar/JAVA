import java.io.*;
public class Account {
    private String accountHolderName;
    private int accountNumber;
    private String address;
    private String accountType;
    private double balance;

    // First constructor
    public Account(String accountHolderName, int accountNumber, double initialAmount) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = initialAmount;
    }

    // Second constructor
    public Account(String accountHolderName, int accountNumber, String address, String accountType, double currentBalance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.address = address;
        this.accountType = accountType;
        this.balance = currentBalance;
    }

    // Method to deposit money into the account
    public void deposit(double amount) {
        balance += amount;
        System.out.println(amount + " deposited successfully.");
    }

    // Method to withdraw money from the account
    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance. Withdrawal failed.");
        } else {
            balance -= amount;
            System.out.println(amount + " withdrawn successfully.");
        }
    }

    // Method to get the current balance
    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        // Create objects of Account class using both constructors
        Account account1 = new Account("John Doe", 123456789, 1000.0);
        Account account2 = new Account("Jane Smith", 987654321, "123 Main St", "Savings", 5000.0);

        // Perform operations on the accounts
        account1.deposit(500.0);
        account2.withdraw(1000.0);

        // Display current balances
        System.out.println("Account 1 balance: " + account1.getBalance());
        System.out.println("Account 2 balance: " + account2.getBalance());
    }
}
