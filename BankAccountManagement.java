import java.util.ArrayList;
import java.util.Date;

class Transaction {
    private Date date;
    private double amount;
    private String type;

    public Transaction(double amount, String type) {
        this.date = new Date();
        this.amount = amount;
        this.type = type;
    }

    @Override
    public String toString() {
        return type + " of " + amount + " on " + date;
    }
}

class BankAccount {
    private String accountHolder;
    private double balance;
    private double monthlyInterestRate;
    private ArrayList<Transaction> transactionHistory;
    private int withdrawalCount;
    private final int MAX_WITHDRAWALS = 3;

    public BankAccount(String accountHolder, double initialBalance, double monthlyInterestRate) {
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
        this.monthlyInterestRate = monthlyInterestRate;
        this.transactionHistory = new ArrayList<>();
        this.withdrawalCount = 0;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            transactionHistory.add(new Transaction(amount, "Deposit"));
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public void withdraw(double amount) {
        if (withdrawalCount >= MAX_WITHDRAWALS) {
            System.out.println("Withdrawal limit reached. Maximum of " + MAX_WITHDRAWALS + " withdrawals allowed per month.");
            return;
        }

        if (amount > 0 && amount <= balance) {
            balance -= amount;
            transactionHistory.add(new Transaction(amount, "Withdrawal"));
            withdrawalCount++;
            System.out.println("Withdrew: " + amount);
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }

    public void calculateMonthlyInterest() {
        double interest = balance * (monthlyInterestRate / 100);
        balance += interest;
        transactionHistory.add(new Transaction(interest, "Monthly Interest"));
    }

    public void printTransactionHistory() {
        System.out.println("\nTransaction History for " + accountHolder + ":");
        for (Transaction transaction : transactionHistory) {
            System.out.println(transaction);
        }
    }

    public void printBalance() {
        System.out.println("\nCurrent Balance for " + accountHolder + ": " + balance);
    }
}

public class BankAccountManagement {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("Nguyen Van A", 5000000, 0.5);

        // Perform transactions
        account.deposit(1000000);
        account.withdraw(500000);
        account.withdraw(200000);
        account.withdraw(300000);
        account.withdraw(100000);  // Exceeds withdrawal limit

        // Calculate and apply monthly interest
        account.calculateMonthlyInterest();

        // Print transaction history and current balance
        account.printTransactionHistory();
        account.printBalance();
    }
}
