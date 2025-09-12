class BankAccount {
    int amount = 0;

    void deposit(int amount) throws Exception {
        if (amount > 0) {
            this.amount += amount;

            System.out.println("Deposit Amount : " + amount + " Total Balance: " + this.amount);
        } else {
            throw new Exception("Amount must be greater than zero");
        }

    }

    void withdraw(int amount) throws Exception {
        if (amount < 0) {

            throw new Exception("Amount must be greater than zero. ");

        }
        if (this.amount <= amount) {
            throw new Exception("Insufficient balance!");
        }
        this.amount -= amount;
        System.out.println("Withdraw Amount: " + amount + " Remaining Balance:" + this.amount);

    }

}

public class ExceptionExample {
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount();
        try {
            b1.deposit(30000);
            b1.withdraw(-10000);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
