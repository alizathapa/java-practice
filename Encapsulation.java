
class BankAccount {
    // data is hidden (private)
    private double balance;

    // constructor
    BankAccount(double initialBalance) {
        balance = initialBalance;
    }

    // getter method to access balance
    public double getBalance() {
        return balance;
    }

    // setter method to safely update balance
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000);

        // Accessing data through methods only (not directly)
        account.deposit(500);
        account.withdraw(200);

        System.out.println("Current Balance: " + account.getBalance());
    }
}
