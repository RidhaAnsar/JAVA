class BankAccount {
    private int balance = 0;

    public synchronized void deposit(int amount) {
        balance += amount;
        System.out.println(Thread.currentThread().getName() + " deposited " + amount + ", current balance: " + balance);
    }

    public synchronized void withdraw(int amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println(Thread.currentThread().getName() + " withdrew " + amount + ", current balance: " + balance);
        } else {
            System.out.println(Thread.currentThread().getName() + " cannot withdraw " + amount + ", insufficient funds.");
        }
    }
}

class DepositThread extends Thread {
    private final BankAccount account;
    private final int amount;

    public DepositThread(BankAccount account, int amount) {
        this.account = account;
        this.amount = amount;
    }

    @Override
    public void run() {
        account.deposit(amount);
    }
}

class WithdrawThread extends Thread {
    private final BankAccount account;
    private final int amount;

    public WithdrawThread(BankAccount account, int amount) {
        this.account = account;
        this.amount = amount;
    }

    @Override
    public void run() {
        account.withdraw(amount);
    }
}

public class bank_thread {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        DepositThread depositThread1 = new DepositThread(account, 100);
        WithdrawThread withdrawThread1 = new WithdrawThread(account, 50);
        DepositThread depositThread2 = new DepositThread(account, 200);
        WithdrawThread withdrawThread2 = new WithdrawThread(account, 150);
        DepositThread depositThread3 = new DepositThread(account, 300);
        WithdrawThread withdrawThread3 = new WithdrawThread(account, 250);

        depositThread1.start();
        withdrawThread1.start();
        depositThread2.start();
        withdrawThread2.start();
        depositThread3.start();
        withdrawThread3.start();
    }
}
