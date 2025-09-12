package Accounts;

public class Main {
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount("Aliza", "BA123", 5000);
        b1.showBankAccount();
        System.out.println();

        CollegeAccount c1 = new CollegeAccount("Aliza", "CA456", "XYZ University");
        c1.showCollegeAccount();
    }
}