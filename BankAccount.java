class Account {
   private double balance;

   Account(double var1) {
      this.balance = var1;
   }

   public double getBalance() {
      return this.balance;
   }

   public void deposit(double var1) {
      if (var1 > 0.0) {
         this.balance += var1;
      }

   }

   public void withdraw(double var1) {
      if (var1 > 0.0 && var1 <= this.balance) {
         this.balance -= var1;
      }

   }
}

public class BankAccount {
  public static void main(String[] args) {
    Account alizaAconut = new Account(1000.0);
    Account bibekAccount = new Account(500.0);

    double balance = alizaAconut.getBalance();
    System.out.println(balance);

    double bibekBalance = bibekAccount.getBalance();
    System.out.println(bibekBalance);
  }
}