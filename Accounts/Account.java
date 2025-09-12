package Accounts;

public class Account {
    String name;
    String accNo;

    public Account(String name, String accNo) {
        this.name = name;
        this.accNo = accNo;

    }

    public void showDetails() {
        System.out.println("Name:" + name);
        System.out.println("Account Number:" + accNo);

    }
}