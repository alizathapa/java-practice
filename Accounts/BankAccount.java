package Accounts;

public class BankAccount extends Account {
    double balance;

    public BankAccount(String name, String accNo, double balance) {
        super(name, accNo);
        this.balance = balance;
    }

    public void showBankAccount() {
        showDetails();
        System.out.println("Balance:" + balance);
    }

}
